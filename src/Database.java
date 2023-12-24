/*
 * Creator(s): Abhay Manoj
 * Date of Creation: December 22nd, 2023
 * Purpose: This connects to the database and has methods for accessing it
 */

import java.sql.*;

public class Database {

    private Connection connection; // connection to the database
    private boolean isConnected; // checks if connected to the database

    public Database() { connect(); }

    /** Method Name: connect
     * @Author Abhay Manoj
     * @Date December 22, 2023
     * @Modified December 22, 2023
     * @Description Connects to the database
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: RuntimeException
     */

    public void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/adb", "root", "abhayx2006");
            isConnected = true;
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    /** Method Name: disconnects
     * @Author Abhay Manoj
     * @Date December 22, 2023
     * @Modified December 22, 2023
     * @Description Disconnects from database
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: RuntimeException
     */

    public void disconnect() {
        try {
            connection.close();
            isConnected = false;
        }  catch (SQLException e) { throw new RuntimeException(e); }
    }


    /** Method Name: addUser
     * @Author Abhay Manoj
     * @Date December 22, 2023
     * @Modified December 22, 2023
     * @Description Adds a user to the database
     * @Parameters username - username of the user, password - password of the user, email - email of the user
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: RuntimeException
     */

    public void addUser(String username, String password, String email) {
        if (username.isBlank() || password.isBlank() || email.isBlank()) {
            System.out.println("User cannot be added, as one or more of their fields are blank.");
            return;
        } if (!isConnected) {
            System.out.println("When attempting to add " + username + ", database was not connected.");
            return;
        } if (hasUser(username)) {
            System.out.println(username + " has already been added to database.");
            return;
        } try {
            PreparedStatement addUserStatement = connection.prepareStatement("insert into users values (?, ?, ?)"); // adding user command
            addUserStatement.setString(1, username);
            addUserStatement.setString(2, password);
            addUserStatement.setString(3, email);
            addUserStatement.executeUpdate();
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    /** Method Name: removeUser
     * @Author Abhay Manoj
     * @Date December 22, 2023
     * @Modified December 22, 2023
     * @Description Removes a user from the database
     * @Parameters username - username of the user
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: RuntimeException
     */

    public void removeUser(String username) {
        if (username.isBlank()) {
            System.out.println("Provided username is blank, could not remove.");
            return;
        } if (!isConnected) {
            System.out.println("When attempting to remove " + username + ", database was not connected.");
            return;
        } if (!hasUser(username)) {
            System.out.println(username + " could not be removed, as they are not present in the database.");
            return;
        } try { connection.prepareStatement("delete from users where username = \"" + username +"\"").executeUpdate(); }
        catch (SQLException e) { throw new RuntimeException(e); }
    }

    /** Method Name: hasUser
     * @Author Abhay Manoj
     * @Date December 22, 2023
     * @Modified December 22, 2023
     * @Description Checks if a user is in the database
     * @Parameters username - username of the user
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: RuntimeException
     */

    public boolean hasUser(String username) {
        if (username.isBlank()) {
            System.out.println("Provided username is blank, could not check if they are present.");
            return false;
        } if (!isConnected) {
            System.out.println("When attempting to check if user " + username + ", is present, database was not connected.");
            return false;
        } try { return connection.prepareStatement("SELECT * FROM users WHERE username = \"" + username + "\"").executeQuery().next(); }
        catch (SQLException e) { throw new RuntimeException(e); }
    }

    /** Method Name: printUsers
     * @Author Abhay Manoj
     * @Date December 22, 2023
     * @Modified December 22, 2023
     * @Description Prints users in database out
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: RuntimeException
     */

    public void printUsers() {
        try {
            ResultSet usersList = connection.createStatement().executeQuery("select * from users"); // the contents of users table
            while (usersList.next()) System.out.printf("%s, %s, %s\n", usersList.getString(1), usersList.getString(2), usersList.getString(3));
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    public boolean isConnected() { return isConnected; }
}
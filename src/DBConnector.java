/*
 * Creator(s): Abhay Manoj
 * Date of Creation: December 22nd, 2023
 * Purpose: This connects to the database and has methods for accessing it
 */

import java.sql.*;

public class DBConnector {

    private Connection connection; // connection to the database
    private boolean isConnected = false; // checks if connected to the database

    public DBConnector() { connect(); }

    /** Method Name: connect
     * @Author Abhay Manoj
     * @Date December 22, 2023
     * @Modified December 22, 2023
     * @Description Connects to the database
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: N/A
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
     * @Throws/Exceptions: N/A
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
     * @Throws/Exceptions: N/A
     */

    public void addUser(String username, String password, String email) {
        if (!isConnected) throw new RuntimeException("USER CANNOT BE ADDED AS DATABASE IS NOT CONNECTED.");
        if (username.isBlank() || password.isBlank() || email.isBlank()) throw new RuntimeException("ONE OF THE USER FIELDS ARE BLANK, USER CANNOT BE ADDED");
        // if the user is already found
        try {
            PreparedStatement addUserStatement = connection.prepareStatement("insert into users values (?, ?, ?)"); // adding user command
            addUserStatement.setString(1, username);
            addUserStatement.setString(2, password);
            addUserStatement.setString(3, email);
            addUserStatement.executeUpdate();
        } catch (SQLException e) { System.out.println(e); }
    }

    /** Method Name: deleteUser
     * @Author Abhay Manoj
     * @Date December 22, 2023
     * @Modified December 22, 2023
     * @Description Deletes a user from the database
     * @Parameters username - username of the user
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: N/A
     */

    public void deleteUser(String username) {
        if (!isConnected) throw new RuntimeException("USER CANNOT BE DELETED AS DATABASE IS NOT CONNECTED.");
        try { connection.prepareStatement("delete from users where username = " + username).executeUpdate(); }
        catch (SQLException e) { System.out.println(e); }
    }

    public void isFound(String username) {
        if (!isConnected) {
            System.out.println("USERNAME CANNOT BE CHECKED DUE TO DATABASE NOT BEING CONNECTED.");
            return;
        }
    }

    public void printUsers() {
        try {
            ResultSet usersList = connection.createStatement().executeQuery("select * from users"); // the contents of users table
            while (usersList.next()) System.out.printf("%s, %s, %s\n", usersList.getString(1), usersList.getString(2), usersList.getString(3));
        } catch (SQLException e) { System.out.println(e); }
    }

    public boolean isConnected() { return isConnected; }
}
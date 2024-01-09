/*
 * Creator(s): Abhay Manoj
 * Date of Creation: January 9th, 2024
 * Purpose: This connects to the database and has methods for accessing it
 */

import java.sql.*;

public class DBConnector {

    private Connection connection; // connection to the database
    private boolean isConnected; // checks if the object is connected to the database

    public DBConnector() { connect(); }

    /** Method Name: connect
     * @Author Abhay Manoj
     * @Date January 09, 2024
     * @Modified January 09, 2024
     * @Description Connects object to the server
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: SQLException
     */

    public void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/adb", "root", "abhayx2006");
            isConnected = true;
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    /** Method Name: disconnect
     * @Author Abhay Manoj
     * @Date January 09, 2024
     * @Modified January 09, 2024
     * @Description Disconnects object from the server
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: SQLException
     */

    public void disconnect() {
        try {
            connection.close();
            isConnected = false;
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    /** Method Name: addUser
     * @Author Abhay Manoj
     * @Date January 09, 2024
     * @Modified January 09, 2024
     * @Description Adds user to the server
     * @Parameters username - the desired username, password - the desired password, email - the desired email
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: SQLException
     */

    public void addUser(String username, String password, String email) {
        isConnectedCheck();
        if (isUserNameBlank(username)) return;
        if (password.isBlank() || email.isBlank()) {
            System.out.println("User cannot be added, as one of the fields are blank.");
            return;
        } if (username.length() > 20 || password.length() > 50 || email.length() > 50) {
            System.out.println("User cannot be added, due to one of the fields being too long.");
            return;
        } if (hasUser(username)) {
            System.out.printf("%s cannot be added, as they are already in the database.", username);
            return;
        } try {
            PreparedStatement addUser = connection.prepareStatement("insert into users (username, loginKey, email) values (?, ?, ?)"); // statement to add the user
            addUser.setString(1, username);
            addUser.setString(2, password);
            addUser.setString(3, email);
            addUser.executeUpdate();
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    /** Method Name: removeUser
     * @Author Abhay Manoj
     * @Date January 09, 2024
     * @Modified January 09, 2024
     * @Description Removes user from the server
     * @Parameters username - the username of the user
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: SQLException
     */

    public void removeUser(String username) {
        isConnectedCheck();
        if (isUserNameBlank(username)) return;
        if (doesNotHaveUser(username)) return;
        try {
            PreparedStatement removeUser = connection.prepareStatement("delete from users where username = ?"); // statement to remove user
            removeUser.setString(1, username);
            removeUser.executeUpdate();
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    /** Method Name: hasUser
     * @Author Abhay Manoj
     * @Date January 09, 2024
     * @Modified January 09, 2024
     * @Description Checks if user is in the server
     * @Parameters username - the username of the user
     * @Returns If the user is in the server, Data Type: Boolean
     * @Dependencies: SQL
     * @Throws/Exceptions: SQLException
     */

    public boolean hasUser(String username) {
        isConnectedCheck();
        if (isUserNameBlank(username)) return false;
        try {
            PreparedStatement hasUser = connection.prepareStatement("select * from users where username = ?"); // statement to check if user is there
            hasUser.setString(1, username);
            ResultSet doesUserExist = hasUser.executeQuery(); // response from the server
            return doesUserExist.next();
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    /** Method Name: setFirstName
     * @Author Abhay Manoj
     * @Date January 09, 2024
     * @Modified January 09, 2024
     * @Description Sets the first name of the user
     * @Parameters username - the username of the user, firstName - the desired first name
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: SQLException
     */

    public void setFirstName(String username, String firstName) {
        isConnectedCheck();
        if (isUserNameBlank(username)) return;
        if (doesNotHaveUser(username)) return;
        if (firstName.isBlank()) {
            System.out.println("Cannot set first name as it is blank.");
            return;
        } try {
            PreparedStatement addFirstName = connection.prepareStatement("update users set firstName = ? where username = ?"); // statement to set first name
            addFirstName.setString(1, firstName);
            addFirstName.setString(2, username);
            addFirstName.executeUpdate();
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    /** Method Name: setLastName
     * @Author Abhay Manoj
     * @Date January 09, 2024
     * @Modified January 09, 2024
     * @Description Sets the last name of the user
     * @Parameters username - the username of the user, lastName - the desired last name
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: SQLException
     */

    public void setLastName(String username, String lastName) {
        isConnectedCheck();
        if (isUserNameBlank(username)) return;
        if (doesNotHaveUser(username)) return;
        if (lastName.isBlank()) {
            System.out.println("Cannot set last name as it is blank.");
            return;
        } try {
            PreparedStatement addLastName = connection.prepareStatement("update users set lastName = ? where username = ?"); // statement to set last name
            addLastName.setString(1, lastName);
            addLastName.setString(2, username);
            addLastName.executeUpdate();
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    /** Method Name: setAge
     * @Author Abhay Manoj
     * @Date January 09, 2024
     * @Modified January 09, 2024
     * @Description Sets the age of the user
     * @Parameters username - the username of the user, age - age of the user
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: SQLException
     */

    public void setAge(String username, int age) {
        isConnectedCheck();
        if (isUserNameBlank(username)) return;
        if (doesNotHaveUser(username)) return;
        if (age <= 0) {
            System.out.println("Age was not set as it is not valid.");
            return;
        } try {
            PreparedStatement addAge = connection.prepareStatement("update users set age = ? where username = ?"); // statement to set age
            addAge.setInt(1, age);
            addAge.setString(2, username);
            addAge.executeUpdate();
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    /** Method Name: setBio
     * @Author Abhay Manoj
     * @Date January 09, 2024
     * @Modified January 09, 2024
     * @Description Sets the bio of the user
     * @Parameters username - the username of the user, bio - bio of the user
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: SQLException
     */

    public void setBio(String username, String bio) {
        isConnectedCheck();
        if (isUserNameBlank(username)) return;
        if (doesNotHaveUser(username)) return;
        if (bio.isBlank()) {
            System.out.println("Cannot set bio as it is blank.");
            return;
        } try {
            PreparedStatement addLastName = connection.prepareStatement("update users set bio = ? where username = ?"); // statement to set last name
            addLastName.setString(1, bio);
            addLastName.setString(2, username);
            addLastName.executeUpdate();
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    /** Method Name: setLocation
     * @Author Abhay Manoj
     * @Date January 09, 2024
     * @Modified January 09, 2024
     * @Description Sets the location of the user
     * @Parameters username - the username of the user, location - location of the user
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: SQLException
     */

    public void setLocation(String username, String location) {
        isConnectedCheck();
        if (isUserNameBlank(username)) return;
        if (doesNotHaveUser(username)) return;
        if (location.isBlank()) {
            System.out.println("Cannot set location as it is blank.");
            return;
        } try {
            PreparedStatement addLocation = connection.prepareStatement("update users set location = ? where username = ?"); // statement to set location
            addLocation.setString(1, location);
            addLocation.setString(2, username);
            addLocation.executeUpdate();
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    /** Method Name: setIsEnglish
     * @Author Abhay Manoj
     * @Date January 09, 2024
     * @Modified January 09, 2024
     * @Description Sets the language of the user
     * @Parameters username - the username of the user, isEnglish - if the user wants english
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: SQLException
     */

    public void setIsEnglish(String username, boolean isEnglish) {
        isConnectedCheck();
        if (isUserNameBlank(username)) return;
        if (doesNotHaveUser(username)) return;
        try {
            PreparedStatement addLocation = connection.prepareStatement("update users set isEnglish = ? where username = ?"); // statement to set location
            addLocation.setBoolean(1, isEnglish);
            addLocation.setString(2, username);
            addLocation.executeUpdate();
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    /** Method Name: setTheme
     * @Author Abhay Manoj
     * @Date January 09, 2024
     * @Modified January 09, 2024
     * @Description Sets the theme of the user
     * @Parameters username - the username of the user, theme - the theme of the user
     * @Returns N/A, Data Type: Void
     * @Dependencies: SQL
     * @Throws/Exceptions: SQLException
     */

    public void setTheme(String username, String theme) {
        isConnectedCheck();
        if (isUserNameBlank(username)) return;
        if (doesNotHaveUser(username)) return;
        if (theme.isBlank()) {
            System.out.println("Cannot set theme as it is blank.");
            return;
        } try {
            PreparedStatement addTheme = connection.prepareStatement("update users set theme = ? where username = ?"); // statement to set location
            addTheme.setString(1, theme);
            addTheme.setString(2, username);
            addTheme.executeUpdate();
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    /** Method Name: isConnectedCheck
     * @Author Abhay Manoj
     * @Date January 09, 2024
     * @Modified January 09, 2024
     * @Description Checks if the object is connected to the server and runs an exception
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * @Dependencies: N/A
     * @Throws/Exceptions: RuntimeException
     */

    private void isConnectedCheck() { if (!isConnected) throw new RuntimeException("Database is not connected."); }

    /** Method Name: isUserNameBlank
     * @Author Abhay Manoj
     * @Date January 09, 2024
     * @Modified January 09, 2024
     * @Description Checks if the username is blank and has error message
     * @Parameters username - username of the user
     * @Returns If the username is blank, Data Type: Boolean
     * @Dependencies: N/A
     * @Throws/Exceptions: N/A
     */

    private boolean isUserNameBlank(String username) {
        if (username.isBlank()) {
            System.out.println("Action cannot be done as username is blank.");
            return true;
        } return false;
    }

    /** Method Name: doesNotHaveUser
     * @Author Abhay Manoj
     * @Date January 09, 2024
     * @Modified January 09, 2024
     * @Description Checks if the user is not in the database and prints error message
     * @Parameters username - username of the user
     * @Returns If the database has the user, Data Type: Boolean
     * @Dependencies: N/A
     * @Throws/Exceptions: N/A
     */

    private boolean doesNotHaveUser(String username) {
        if (!hasUser(username)) {
            System.out.println("Action cannot be done as user is not in the database.");
            return true;
        } return false;
    }

    /** Method Name: isConnected
     * @Author Abhay Manoj
     * @Date January 09, 2024
     * @Modified January 09, 2024
     * @Description Returns if the database is connected
     * @Parameters N/A
     * @Returns If the database is connected, Data Type: Boolean
     * @Dependencies: N/A
     * @Throws/Exceptions: N/A
     */

    public boolean isConnected() { return isConnected; }
}
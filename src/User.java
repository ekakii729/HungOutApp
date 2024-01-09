/*
 * Creator(s): Devin Tran
 * Date Of Creation: December 19th, 2023
 * Purpose: This class represents a user of the program
 */

import java.util.ArrayList;

public class User {

    private String username;
    private String password;
    private String email;
    private ArrayList<User> friendsList;

    public User(){

    }

    public User(String username, String password, String email, ArrayList<User> friendsList){
        this.username = username;
        this.password = password;
        this.email = email;
        this.friendsList = friendsList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<User> getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(ArrayList<User> friendsList) {
        this.friendsList = friendsList;
    }
}

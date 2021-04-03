package co.harsh.Assignment3.Q6;


import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private String password;
    public static List<User> userList = new ArrayList<>();
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }

    public static boolean addUser(User user){
        return userList.add(user);
    }

    public static String user_Login(String name,String pass){
        for(User user: userList){
            if(name.equalsIgnoreCase(user.username) && pass.equalsIgnoreCase(user.password)){
                return "Login Successfully";
            }
        }
        return "Invalid Details";
    }
    public static String user_Logout(String name){
        for(User user: userList){
            if(name.equalsIgnoreCase(user.username)){
                return name+" Logout Successfully";
            }
        }
        return "No Users Exist";
    }

    public List<User> getAllUsers(){
        return userList;
    }

    public static boolean deleteUser(String name) {
        return userList.removeIf(p -> p.username.equalsIgnoreCase(name));
    }
}

package co.harsh.Assignment3.Q6;

public class Application {

    ChatRoom room;
    User user;

    public void createChatroom(){
        room = ChatRoom.createChatroom();
        if(room!=null)
            System.out.println("ChatRoom Created");
    }

    public void addUser(String username,String password){
       boolean check = room.addUser(new User(username,password));
        if(check)
            System.out.println("User Added Successfully");
        else
            System.out.println("Not Added");
    }

    public void userLogin(String username,String password){
        System.out.println(User.user_Login(username,password));

    }

    public void sendMessage(String message){
        Messages.messages.add(message);
        System.out.println(message);
    }

    public void displayMessages(){
        for (String message : Messages.messages)
            System.out.println(message);
    }

    public void getAllUsers(){
        for(User user: User.userList)
            System.out.println(user);
    }

    public void logOut(String username){
        System.out.println(User.user_Logout(username));
    }

    public void deleteUser(String username){
        boolean check = User.deleteUser(username);
        if(check){
            System.out.println("User "+username+" Deleted Successfully");
        }
        else{
            System.out.println("Not Deleted User Doesn't Exist");
        }
    }

    public void deleteChatRoom(){
        System.out.println("Room Deleted Successfully");
    }

}

package co.harsh.Assignment3.Q6;

public class Test {
    public static void main(String[] args) {
        Application app = new Application();

        app.createChatroom();
        app.addUser("Harry","Harry123");
        app.userLogin("Harry","Harry123");
        app.sendMessage("Hey I'm Here");
        app.sendMessage("Hey");
        app.sendMessage("Hi");
        app.sendMessage("Hey Harsh here");
        app.addUser("Ram","Ram12312");


        app.getAllUsers();
        app.logOut("Ram");

        app.displayMessages();
        app.deleteUser("Ram");
        app.deleteChatRoom();
    }
}

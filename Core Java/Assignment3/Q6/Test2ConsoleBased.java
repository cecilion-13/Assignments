package co.harsh.Assignment3.Q6;


import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2ConsoleBased {
        public static void main(String[] args) {

            boolean quit = false;
            String username;
            String password;
            Scanner sc = new Scanner(System.in);

            Application app = new Application();

            while(!quit){
                System.out.println("1. Create a ChatRoom \n 2. Add the User \n3. User login\n 4.Send a message \n 5. Display the messages from a specific chatroom\n 6. List down all users belonging to the specified chatroom.\n 7. Logout\n 8. Delete an user.\n 9. Delete the chatRoom");
                System.out.println("Select an option: ");
                int option = sc.nextInt();
                sc.hasNextLine();

                switch (option){
                    case 1:
                        app.createChatroom();
                        break;

                    case 2:
                        System.out.println("Enter Username and Password");
                        username = sc.next();
                        password = sc.next();
                        app.addUser(username,password);
                        break;

                    case 3:
                        System.out.println("Enter Username and Password");
                        username = sc.next();
                        password = sc.next();
                        app.userLogin(username,password);
                        break;

                    case 4:
                        System.out.println("Enter your Message");
                        String message = sc.next();
                        app.sendMessage(message);
                        break;

                    case 5:
                        app.displayMessages();
                        break;

                    case 6:
                        app.getAllUsers();
                        break;

                    case 7:
                        System.out.println("Enter Username");
                        username = sc.next();
                        app.logOut(username);
                        break;

                    case 8:
                        System.out.println("Enter Username");
                        username = sc.next();
                        app.deleteUser(username);
                        break;

                    case 9:
                        app.deleteChatRoom();
                        quit = true;
                        break;

                }
            }
        }
}

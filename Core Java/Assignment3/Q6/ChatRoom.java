package co.harsh.Assignment3.Q6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ChatRoom {

    //public User user;
    //public List<String> messages;


    private ChatRoom(){
    }

    public static ChatRoom createChatroom(){
        ChatRoom room = new ChatRoom();
        return room;
    }

    public boolean delteChatRoom(){
                   return true;
    }

    public boolean addUser(User user){
        return User.addUser(user);
    }


}

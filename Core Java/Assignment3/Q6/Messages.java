package co.harsh.Assignment3.Q6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Messages {
    public static List<String> messages = new ArrayList<>();
    public void sendAMessage(String message){
               messages.add(message);
    }


    public List<String> displayMessage(String name){
                return messages;
    }




}

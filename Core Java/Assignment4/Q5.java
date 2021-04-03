package co.harsh.Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Q5 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Harry","Andrew","Ron","Isha","Indiana");

        Consumer<List<String>> createFirstLetterContainingString = (wordList)->{
            StringBuilder str = new StringBuilder();
            for(String word:wordList){
                str.append(word.charAt(0));
            }
            System.out.println(str);
        };

        createFirstLetterContainingString.accept(list);

    }
}

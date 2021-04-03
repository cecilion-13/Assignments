package co.harsh.Assignment4.Q4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Q4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Trevor");
        list.add("Maxwell");
        list.add("Rutherford");
        list.add("Andrew");

        list.removeIf(word->(word.length()%2!=0));

        for (String s : list) {
            System.out.println(s);
        }

    }


}

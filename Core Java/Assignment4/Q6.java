package co.harsh.Assignment4;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Q6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Harry", "Andrew", "Ron", "Isha","andy");

        UnaryOperator<List<String>> upperCase = wordList->{
            wordList.replaceAll(String::toUpperCase);
            return wordList;
        };
        upperCase.apply(list);

        list.stream().forEach(System.out::println);

    }
}
package co.harsh.Assignment5.Questions;

import co.harsh.Assignment5.Model.News;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Answers4to7 {

    public static void main(String[] args) {
        List<News> newsList = Arrays.asList(new News(101, "Harry", "Tom", "Nice"),
                new News(102, "Ron", "Stuart", "Great Work"),
                new News(103, "Maxwell", "Andrew", "Not So Good"),
                new News(101, "Harry", "Andrew", "budget Good"),
                new News(103, "Maxwell", "Andrew", "Not So Good"),
                
                new News(101, "Harry", "Andrew", "budget Good"),
                new News(104, "Kylie", "Mandy", "budget"),
                new News(104, "Kylie", "Mandy", "Fine"),
                new News(104, "Kylie", "Mandy", "Fine and in budget"));

        System.out.println("Answer 4");

        Map<Integer, List<News>> listMap = newsList.stream().collect(Collectors.groupingBy(e -> e.getNewsId()));

        Set<Integer> set = listMap.keySet();
        int size = 0;
        Integer id = 0;
        for (Integer i : set) {
            if (size < listMap.get(i).size()) {
                size = listMap.get(i).size();
                id = i;
            }
        }
        System.out.println("News Id with most comments is :" + id);

        System.out.println("-----------");
        System.out.println("Answer 5");

        long countBudget = newsList.stream().filter(e -> e.getComment().contains("budget")).count();
        System.out.println(countBudget+" times word 'budget' arrives in the comments of all news");

        System.out.println("-------------\nAnswer 6");
        Map<String, List<News>> listMapfor6 = newsList.stream().collect(Collectors.groupingBy(e -> e.getCommentByUser()));
        //System.out.println(listMapfor6);
        Set<String> setfor6 = listMapfor6.keySet();
        int sizefor6 = 0;
        String namefor6 = "";
        for (String  i : setfor6) {
            if (sizefor6 < listMapfor6.get(i).size()) {
                sizefor6 = listMapfor6.get(i).size();
                namefor6 = i;
            }
        }
        System.out.println(namefor6 +" is the user who's posted maximum comments!");

        System.out.println("-----------\nAnswer7\nComment By User wise number of Comments are");
        for (String  name : setfor6) {
            System.out.println(name +"="+ listMapfor6.get(name).size());
            }
        }

}
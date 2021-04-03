package co.harsh.Assignment4.Q3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UsingConsumer {

    public static void main(String[] args) {
        Consumer<Integer> display = (a)-> System.out.println(a);
        display.accept(2500);

        List<Integer> list = Arrays.asList(1,3,4,5);
        UsingConsumer(list,(list1)-> list1.stream().forEach(a->System.out.print(a+" ")));
    }
    private static void UsingConsumer(List<Integer> list, Consumer<List<Integer>> func){

        for(int i=0;i<list.size();i++) {
            list.set(i,2*list.get(i));
        }
        func.accept(list);
    }
}

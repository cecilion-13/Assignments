package co.harsh.Assignment4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Q8 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1,3,4,5,6,7,8);

        Consumer<List<Integer>> display = (list)->{
          for(Integer i:list){
              System.out.println(i);
          }
        };
        Thread t = new Thread(()->display.accept(numbersList));
        t.run();


    }
}

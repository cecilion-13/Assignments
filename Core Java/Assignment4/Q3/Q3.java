package co.harsh.Assignment4.Q3;

import javax.naming.ldap.PagedResultsControl;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q3 {


    public static void main(String[] args) {
        System.out.println(UsingFunction(10,a->a/2.0));
        System.out.println(UsingSupplier(15,()->Math.random()));

        Supplier<Double> randomValue = ()->Math.random();
        System.out.println(randomValue.get());

        Predicate<Integer> checkEven = (n)->{
            if(n%2==0)
                return true;
            return false;
        };

        System.out.println(checkEven.test(10));
        System.out.println(UsingPredicate(21,a->{
            if(a%2==0)
                return true;
            return false;
        }));

        Consumer<Integer> display = (a)-> System.out.println(a);
        display.accept(2500);

        List<Integer> list = Arrays.asList(1,3,4,5);
        UsingConsumer(list,(list1)-> list1.stream().forEach(a->System.out.print(a+" ")));
    }
    private static Double UsingFunction(Integer a, Function<Integer,Double> func){
      return func.apply(10);
    }

    private static Double UsingSupplier(Integer a, Supplier<Double> n){
        return n.get();
    }

    private static boolean UsingPredicate(Integer a,Predicate<Integer> checkEven){
        return checkEven.test(a);
    }

    private static void UsingConsumer(List<Integer> list,Consumer<List<Integer>> func){

        for(int i=0;i<list.size();i++) {
             list.set(i,2*list.get(i));
        }
        func.accept(list);
    }
}

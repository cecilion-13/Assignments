package co.harsh.Assignment4.Q3;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UsingPredicate {

    public static void main(String[] args) {

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

    }

    private static boolean UsingPredicate(Integer a, Predicate<Integer> checkEven){
        return checkEven.test(a);
    }

}

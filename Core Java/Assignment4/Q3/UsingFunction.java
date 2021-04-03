package co.harsh.Assignment4.Q3;

import java.util.function.Function;

public class UsingFunction {
    public static void main(String[] args) {
        System.out.println(UsingFunction(10,a->a/2.0));
    }
    private static Double UsingFunction(Integer a, Function<Integer,Double> func){
        return func.apply(10);
    }

}

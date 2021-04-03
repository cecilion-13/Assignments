package co.harsh.Assignment4.Q3;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UsingSupplier {

    private static Double UsingSupplier(Integer a, Supplier<Double> n){
        return n.get();
    }

    public static void main(String[] args) {
        System.out.println(UsingSupplier(15,()->Math.random()));

        Supplier<Double> randomValue = ()->Math.random();
        System.out.println(randomValue.get());

    }
}

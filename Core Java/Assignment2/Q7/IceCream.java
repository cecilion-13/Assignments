package co.harsh.Assignment2.Q7;

import java.util.List;

public class IceCream extends DessertItem{
    @Override
    public double getCost() {
        return 1+(1*0.1);
    }


    @Override
    public String toString() {
        return "IceCream";
    }
}

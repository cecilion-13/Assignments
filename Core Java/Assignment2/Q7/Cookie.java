package co.harsh.Assignment2.Q7;

public class Cookie extends DessertItem{
    @Override
    public double getCost() {
        return 70+(70*0.1);
    }


    @Override
    public String toString() {
        return "Cookie";
    }
}

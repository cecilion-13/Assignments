package co.harsh.Assignment2.Q7;

public class Candy extends DessertItem{
    @Override
    public double getCost() {
        return 60+(60*0.1);
    }


    @Override
    public String toString() {
        return "Candy";
    }
}

package co.harsh.Assignment3.Q1;
import java.util.*;
public class Person implements Comparable<Person> {
    private int weight;
    private int height;
    private String name;

    public Person(int weight,int height,String name){
        this.weight=weight;
        this.height=height;
        this.name=name;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Person p){
        if(weight>p.weight){
            return 1;
        }
        else if(weight<p.weight){
            return -1;
        }
        else {
            if(height>p.height)
                return 1;
            else if(height<p.height)
                return -1;
            else
                return 0;
        }
    }
}

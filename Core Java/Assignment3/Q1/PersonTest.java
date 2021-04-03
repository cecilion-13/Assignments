package co.harsh.Assignment3.Q1;

import java.util.Set;
import java.util.TreeSet;

public class PersonTest {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<Person>();
        Person p1 = new Person(10,2,"Harry");
        Person p2 = new Person(8,1,"Zoe");
        Person p3 = new Person(12,5,"Jerry");
        Person p4 = new Person(18,4,"Tom");
        Person p5 = new Person(12,3,"Ram");
        Person p6 = new Person(12,6,"Ron");

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        set.add(p6);

        for(Person p:set){
            System.out.println("Name:"+p.getName()+", Weight:"+p.getWeight()+", Height:"+p.getHeight());
        }
    }
}

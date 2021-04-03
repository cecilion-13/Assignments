package co.harsh.Assignment5.Questions;

import co.harsh.Assignment5.Model.Fruit;

import java.util.Arrays;
import java.util.List;

public class Answer1to3 {
    public static void main(String[] args) {
        List<Fruit> fruitList = Arrays.asList(new Fruit("Apple",100,200,"Red"),
                new Fruit("Mango",50,100,"Yellowish Green"),
                new Fruit("Orange",80,150,"Orange"),
                new Fruit("Litchi",10,120,"Red"),
                new Fruit("Banana",150,100,"Yellow"));

        System.out.println("Answer 1\nFruits based on calories less than 100 sorted in descending order of calories");

        fruitList.stream().filter(p->p.getCalories()<100).sorted((ob1,ob2)->
                ob2.getCalories().compareTo(ob1.getCalories())).forEach(System.out::println);


        System.out.println("-----------------");
        System.out.println("Answer 2\nFruits list based on color");
        fruitList.stream()
                .sorted((object1,object2)->object1.getColor().compareTo(object2.getColor()))
                .forEach(e-> System.out.println(e));


        System.out.println("-----------------");
        System.out.println("Answer 3\nRed Color Fruits sorted based on price in ascending order");
        fruitList.stream().filter(p->p.getColor().equalsIgnoreCase("red")).sorted((ob1,ob2)->
                ob1.getPrice().compareTo(ob2.getPrice())
        ).forEach(System.out::println);


    }
}

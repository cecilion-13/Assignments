package co.harsh.Assignment3.Q4;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Date, Employee> employeeMap = new HashMap<>();

        Date d1 = new Date(1,2,2012);
        Date d2 = new Date(1,2,2013);
        Date d3 = new Date(3,4,2014);
        Date d4 = new Date(4,5,2015);

        Employee e1 = new Employee(101,"Harmonie",40000);
        Employee e2 = new Employee(102,"Ron",60000);
        Employee e3 = new Employee(103,"Tom Riddle",80000);
        Employee e4 = new Employee(104,"Albus",100000);

        employeeMap.put(d1,e1);
        employeeMap.put(d2,e2);
        employeeMap.put(d3,e3);
        employeeMap.put(d4,e4);

        //Here the get method for d1 and d2 key return same
        //result because of bad implementation of equals method
        System.out.println(employeeMap.get(d1));
        System.out.println(employeeMap.get(d2));

    }
}

package co.harsh.Assignment3;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(3);

        ListIterator<Integer> itr = list.listIterator(list.size());
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}

package co.harsh.Assignment3.Q2;
import java.util.*;

public class Question2 {

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkHashSet = new LinkedHashSet<>();
        /**
         * Add number to hashSet
         */
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(8);
        hashSet.add(4);
        hashSet.add(3);
        /**
         * Add number to linkHashSet
         */
        linkHashSet.add(1);
        linkHashSet.add(2);
        linkHashSet.add(3);
        linkHashSet.add(5);
        linkHashSet.add(4);
        System.out.print("Elements of HashedSet:");
        for(Integer x:hashSet){
            System.out.print(x+" ");
        }

        System.out.print("\nElements of LinkedHashSet:");
        for(Integer x:linkHashSet){
            System.out.print(x+" ");
        }


    }
}

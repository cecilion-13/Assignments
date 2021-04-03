package co.harsh.Assignment3.Q5;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Hashtable<Q5,Integer> table = new Hashtable<>();
        table.put(new Q5("Harry"),4);
        table.put(new Q5("Tom"),5);
        table.put(new Q5("Danny"),6);

        /*
        Set<Map.Entry<Q5,Integer>> entrySet = table.entrySet();
        for(Map.Entry<Q5,Integer> entry: entrySet){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


         */
        for(Map.Entry m:table.entrySet()){
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }
    }
}

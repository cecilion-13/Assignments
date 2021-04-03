package co.harsh.Assignment3.Q8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FailFastIteratorExample {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Jai",1);
        map.put("Zoe",2);
        map.put("Ron",3);

        Set<String> keySet = map.keySet();
        Iterator<String> itr = keySet.iterator();
        while(itr.hasNext()){

            String name = itr.next();
            System.out.println(name+"\t"+map.get(name));
            //map.put("Monty",4); it throws Concurrent Modification Exception
        }
    }
}

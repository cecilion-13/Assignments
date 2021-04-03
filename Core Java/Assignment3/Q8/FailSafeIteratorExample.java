package co.harsh.Assignment3.Q8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIteratorExample {

    public static void main(String[] args) {
        Map<String,Integer> map = new ConcurrentHashMap<>();
        map.put("Jai",1);
        map.put("Zoe",2);
        map.put("Ron",3);

        Set<String> keySet = map.keySet();
        Iterator<String> itr = keySet.iterator();
        while(itr.hasNext()){

            String name = itr.next();
            System.out.println(name+"\t"+map.get(name));
            map.put("Monty",4);
            //it doesn't throws Concurrent Modification Exception
        }
        System.out.println("------------------");
        map.forEach((key,value)->{
            System.out.print(key+" ");
            System.out.println(value);
        });
    }
}

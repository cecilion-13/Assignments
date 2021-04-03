package co.harsh.Assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Q7 {
    public static void main(String[] args) {
        Map<String ,String > wordMap = new HashMap<>();
        wordMap.put("Harry","Ron");
        wordMap.put("Lipton","Tom");

        StringBuilder str = new StringBuilder();
        Set<String> keys = wordMap.keySet();

        for(String s:keys){
            str.append(s);
            String value = wordMap.get(s);
            str.append(value);
        }
        System.out.println(str);
    }
}

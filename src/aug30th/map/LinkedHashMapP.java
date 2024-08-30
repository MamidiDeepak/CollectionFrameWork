package aug30th.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapP {
    public static void main(String[] args) {


        Map<Integer, String> m = new HashMap<>();

        m.put(500034, "BJ Hills");
        m.put(500045, "JB Hills");
        m.put(500081, "Gachibowli");

        Set<Integer> keys = m.keySet();
//        System.out.println(keys);
        for (Integer s : keys) {
            System.out.println(s);
        }

        System.out.println("___________");
        Collection<String> val = m.values();
//        System.out.println(keys);
        for (String va : val) {
            System.out.println(va);
        }
        System.out.println("______________-");
        System.out.println(m.get(500045));

        System.out.println("_____________");
        for (Integer kys : keys) {
            System.out.println(kys + " >>>>>> " + m.get(kys));
        }

        System.out.println("__________");

        Set<Map.Entry<Integer, String>> entries = m.entrySet();

        for (Map.Entry<Integer, String> sd : entries) {
            Integer e = sd.getKey();
            String s = sd.getValue();
            System.out.println(e + " >> " + s);
        }
    }
}

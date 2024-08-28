package aug27th;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableClass {
    public static void main(String[] args) {

        Map<Integer, String> m = new Hashtable<>();
        m.put(500034, "Banjara Hills");
        m.put(500081, "Gachibowli");
        m.put(500082, "Kukatpally");

       //Get keys from the Map
        Set<Integer> keys = m.keySet();

        for(Integer key : keys){
            System.out.println(key);
        }

        System.out.println("__________");

//        Get values from the Map
        Collection<String> valu = m.values();

        for(String val : valu){
            System.out.println(val);
        }

        System.out.println("__________");

//        Get value using key...
        System.out.println(m.get(500034));

        System.out.println("__________");

//        Get value with keys..

        for(Integer keyy : keys){
            System.out.println(keyy+" >>>>>> "+m.get(keyy));
        }
        System.out.println("__________");
//        Test removing of element..
        System.out.println(m);
        System.out.println(m.remove(500034));
        System.out.println(m);
        System.out.println("_______");
//        verify key contains......
        System.out.println(m.containsKey(500082));
        System.out.println(m.containsValue("Gachibowli"));
    }
}

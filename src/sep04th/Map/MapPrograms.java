package sep04th.Map;

import java.util.*;

public class MapPrograms {
    public static void main(String[] args) {

//        Hashtable<Integer, String> ht = new Hashtable<>();
        HashMap<Integer, String> ht = new HashMap<>();
//        LinkedHashMap<Integer, String> ht = new LinkedHashMap<>();
//        TreeMap<Integer, String> ht = new TreeMap<>();
        ht.put(1,"Deepak");
        ht.put(2,"Mamidi");
        ht.put(3,"QA");
        ht.put(4,"Engineer");

//        System.out.println(ht);

//        Retrieve
//        System.out.println("retrieve "+ht.get(3));
//        System.out.println("retrieve "+ht.get(2));

        Set<Integer> keys = ht.keySet();
        for(Integer key : keys){
            System.out.println(key);
        }
        System.out.println("_________");
        Collection<String> c = ht.values();
        for(String cc : c){
            System.out.println(cc);
        }
        System.out.println("__________");
        System.out.println(ht.get(4));

        System.out.println("________");

        for(Integer i : keys){
            System.out.println(i+ " >>>>>>> "+ht.get(i));
        }

        System.out.println("__________");

        Set<Map.Entry<Integer,String>> ff = ht.entrySet();
        for(Map.Entry<Integer,String> entries : ff){
            Integer kk = entries.getKey();
            String ss = entries.getValue();
            System.out.println(kk+ " >>> "+ss);
        }
     }
}

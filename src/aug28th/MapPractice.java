package aug28th;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

       Map<Integer, String> m = new LinkedHashMap<>();
       m.put(500034, "Banjara Hills");
       m.put(500081, "Gachibowli");
//       m.put(500035, "Jubilee Hills");

       Set<Integer> keys = m.keySet();
       for (Integer key : keys){
           System.out.println(key);
       }
        System.out.println("___________");
       Collection<String> value = m.values();
       for(String v : value){
           System.out.println(v);
       }
        System.out.println("____________");

        System.out.println(m.get(500034));

        System.out.println("________");
      for(Integer j : keys){
          System.out.println(j+" >>> "+m.get(j));
      }
        System.out.println("________");

        System.out.println(m);
//        System.out.println(m.remove(500034));
//        System.out.println(m);
        m.remove(500034, "Banjara Hills");
        System.out.println(m);

        System.out.println("__________");

        System.out.println(m.containsKey(500035));
        System.out.println(m.containsKey(500334));
        System.out.println("__________");
        System.out.println(m.containsValue("Jubilee Hills"));
        System.out.println(m.containsValue("Jubilee Hillss"));

        System.out.println("_______");
        System.out.println(m);
//        m.put(500035, "Jharkand");
        System.out.println(m);
        m.putIfAbsent(500035, "Deepak");
        System.out.println(m);

        System.out.println("______");

//        Set<Map.Entry<Integer,String>> ent = m.entrySet();
//        for(Map.Entry<Integer, String> entry :ent){
//            Integer i = entry.getKey();
//            String s  = entry.getValue();
//            System.out.println(i+" >>>> "+s);
//        }

        Set<Map.Entry<Integer, String>> ent = m.entrySet();
        for(Map.Entry<Integer, String> va : ent){
            Integer i = va.getKey();
            String s = va.getValue();
            System.out.println(i+" >>>>> "+s);
        }

    }
}

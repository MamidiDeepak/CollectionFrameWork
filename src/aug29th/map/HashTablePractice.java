package aug29th.map;

import javax.swing.text.html.parser.Entity;
import java.security.KeyStore;
import java.util.*;

public class HashTablePractice {
    public static void main(String[] args) {

        Map<Integer, String> m = new Hashtable<>();
        m.put(500034, "BJ");
        m.put(500041, "JH");
        m.put(500042, "Jsdf");
        m.put(500043, "sfs");
        m.put(500044, "dg");
        System.out.println(m);

        m.put(500034,"kukatpally");
        m.putIfAbsent(500034, "delhi");
        m.replace(500041,"punjab");

        Set<Integer> s = m.keySet();
        for (Integer i : s){
            System.out.println(i);
        }
        System.out.println("_______________");
        Collection<String> v = m.values();
        for(String sh : v){
            System.out.println(sh);
        }
        System.out.println("________");

        System.out.println(m.get(500034));

        System.out.println("_______");

       for(Integer f : s){
           System.out.println(f+" >>> "+m.get(f));
       }
        System.out.println("_______");

        System.out.println(m.containsKey(500034));
        System.out.println(m.containsValue("punjab"));

      Set<Map.Entry<Integer,String>> se = m.entrySet();
      for(Map.Entry<Integer,String> ff : se){
          Integer sf = ff.getKey();
          String s2f = ff.getValue();
          System.out.println(sf+" >> "+s2f);
      }



    }
}

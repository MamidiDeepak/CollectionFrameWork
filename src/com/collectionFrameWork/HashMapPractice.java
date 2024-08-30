package com.collectionFrameWork;

import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {

//            Map<Integer, String> map = new Hashtable<>();
//        Map<Integer, String> map = new HashMap<>();
//        Map<Integer, String> map = new TreeMap<>();
        Map<Integer, String> map = new LinkedHashMap<>();
            map.put(500034,"Banjara Hills");
            map.put(400034, "Mumbai");
            map.put(500081, "Gachibowli");

           //get keys..
            Set<Integer> keys = map.keySet();
//            for (Integer i : keys){
//                System.out.println(i);
//            }

        for(Integer key : keys){
            System.out.println(key+ " >>>>> "+map.get(key));
        }

        System.out.println("__________");

            //get value
        Collection<String> val = map.values();
            for (String value : val){
                System.out.println(value);
            }

        System.out.println("_________");
            //get value using key

        System.out.println(map.get(500034));

        System.out.println("__________");
        //get key with value

        for(Integer key : keys){
            System.out.println(key+ " >>>>> "+map.get(key));
        }

        System.out.println("____________");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> ent : entries){
            Integer kys = ent.getKey();
            String valu = ent.getValue();
            System.out.println(kys+ " >> "+valu);
        }


    }
}

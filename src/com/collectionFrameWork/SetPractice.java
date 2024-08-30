package com.collectionFrameWork;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10); //dummy new object()
        set.add(30); //Does not follow the insertion order.
        set.add(80); //Does not follow the insertion order.
        set.add(40); //Does not follow the insertion order.
        System.out.println(set);
        System.out.println(set.contains(30));

        System.out.println("____________");
        System.out.println("____________");
        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(34);
        lhs.add(56);
        lhs.add(99);
        System.out.println(lhs);

        System.out.println("____________");
        System.out.println("____________");
        Set<String> ts = new TreeSet<>();
        ts.add("Deepak");
        ts.add("Mamidi");
        ts.add("QA");
        ts.add("Engineer");
        System.out.println(ts);
    }
}

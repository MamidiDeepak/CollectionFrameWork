package sep04th.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetP {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Deepak");
        hs.add("Mamidi");
        hs.add("QA");
        hs.add("Engineer");
        hs.add(null);

        System.out.println(hs);

        System.out.println("________________");
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Deepak");
        lhs.add("Mamidi");
        lhs.add("QA");
        lhs.add("Engineer");
        lhs.add(null);

        System.out.println(lhs);
        System.out.println("_________________");
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Deepak");
        ts.add("Mamidi");
        ts.add("QA");
        ts.add("Engineer");
//        ts.add(null);

        System.out.println(ts);

    }
}

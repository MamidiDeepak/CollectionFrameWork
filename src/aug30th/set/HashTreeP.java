package aug30th.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashTreeP {
    public static void main(String[] args) {
//        Follows binary format (ascending order)

        Set<Integer> hs1 = new TreeSet<>();
        hs1.add(10);
        hs1.add(32);
        hs1.add(23);
        hs1.add(19);
        System.out.println(hs1);
    }
}

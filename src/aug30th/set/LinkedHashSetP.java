package aug30th.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetP {
    public static void main(String[] args) {
//Follows Insertion order
        Set<Integer> hs1 = new LinkedHashSet<>();
        hs1.add(10);
        hs1.add(32);
        hs1.add(23);
        hs1.add(19);
        System.out.println(hs1);
    }
}

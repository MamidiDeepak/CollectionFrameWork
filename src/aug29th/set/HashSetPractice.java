package aug29th.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {

        Set<Integer> s = new HashSet<>();
//        Add elements to set
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
//        System.out.println(s);
//
////        verify the elements in set
//        System.out.println(s.contains(20));
//        System.out.println(s.contains(200));
//
////        remove the element from set
//        s.remove(10);
//        System.out.println(s);

//        Retrieve element from set
        for (Integer i : s) {
            System.out.println(i);
        }
    }
}

package aug29th.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPractice {
    public static void main(String[] args) {

//        Set<Integer> lhs = new LinkedHashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(30);
        lhs.add(90);
        lhs.add(20);
        System.out.println(lhs);

//        Verify the elements in the set

        System.out.println(lhs.contains(10));

//        Remove the element from set
        lhs.remove(30);
        System.out.println(lhs);

//        retrieve the elements from list
        for(Integer il : lhs){
            System.out.println(il);
        }

        lhs.addFirst(100);
        System.out.println(lhs);

        lhs.removeFirst();
        System.out.println(lhs);

        lhs.removeLast();
        System.out.println(lhs);

        System.out.println(lhs.isEmpty());
    }
}

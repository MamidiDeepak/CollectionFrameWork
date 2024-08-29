package aug29th.List.linkedList;

import java.util.*;

public class LinkedListPractice {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        System.out.println(ll);
        ll.add(0,30);
        System.out.println(ll);

//        Creating new ArrayList Again
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(40);
        ll1.add(50);

        ll.addAll(ll1);
        System.out.println(ll);
        ll.addAll(0, ll1);
        System.out.println(ll);

//        Retrieving the element from linkedlist

        System.out.println(ll.get(1));

//        Verify the element in linkedList
        System.out.println(ll.contains(50));
        System.out.println(ll.containsAll(ll1));

//        Update the element in the list
        System.out.println(ll);
        ll.set(0,1000);
        System.out.println(ll);

//        Remove the element from the list
        System.out.println(ll.remove());
        System.out.println(ll);
        System.out.println(ll.removeAll(ll1));
        System.out.println(ll);
    }
}

package aug30th.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListP {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
//        Add elements to linkedist
        ll.add(10);
        ll.add(20);
        ll.add(0,200);
        ll.add(300);
        System.out.println(ll);

        ArrayList<Integer> ds = new ArrayList<>();
        ds.add(1000);
        ll.addAll(ds);

//        retrieve element from list
        System.out.println(ll.get(1));

//        verify elments from list
        System.out.println(ll.contains(20));

//        update element in list
        System.out.println(ll.set(0,300));

//        remove element from list
        System.out.println(ll);
        ll.remove();
        System.out.println(ll);
        ll.remove(2);
        System.out.println(ll);

        System.out.println(ll.remove());
        System.out.println(ll);

        Collections.synchronizedList(ll);
    }
}

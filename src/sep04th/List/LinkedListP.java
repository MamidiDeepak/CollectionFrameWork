package sep04th.List;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListP {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Deepak");
        ll.add("Mamidi");
        ll.add("QA");
        ll.add("Engineer");

        System.out.println(ll);
//        Retrieve the values...
        System.out.println(ll.get(0));

//        Verify the elements
        System.out.println(ll.contains("QA"));

//        Update the elements
        System.out.println(ll.set(1,"irfan"));
        System.out.println(ll);

//        Remove element
        System.out.println(ll.remove(0));
        System.out.println(ll);

        Collections.synchronizedList(ll);
    }
}

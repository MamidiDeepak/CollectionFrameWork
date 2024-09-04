package sep04th.List;

import java.util.Arrays;
import java.util.Vector;

public class VectorP {
    public static void main(String[] args) {

        // Create Vector list
//        Add the elements to list
//        Retrieve the elements from list
//        Verify the elements in the list
//        Update the elements in the list
//        remove the elements in the list

        Integer[] i = new Integer[] {32,32,12,32};
        Vector<Integer> v = new Vector<>(Arrays.asList(i));
//        Adding elements
        v.add(10);
        v.add(20);
        v.add(40);
        v.add(80);
        v.add(20);

        System.out.println(v);
//        System.out.println(v.size());
//        System.out.println(v.capacity());

//        Retrieve the elements

        System.out.println("retrieved "+v.get(4));

//        Verify the element

        System.out.println("verify "+v.contains(80));

//        update the element

        System.out.println("update "+v.set(3,789));
        System.out.println(v);

//        remove the element

        System.out.println(v.remove(3));
        System.out.println(v);

        Vector<Integer> v1 = new Vector<>();
//        Adding elements
        v1.add(100);
        v1.add(200);
        v1.add(400);

        System.out.println(v.addAll(v1));
        System.out.println(v);

        System.out.println(v.containsAll(v1));
        System.out.println(v.removeAll(v1));
        System.out.println(v);

    }
}

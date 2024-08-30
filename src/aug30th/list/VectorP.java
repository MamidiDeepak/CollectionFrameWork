package aug30th.list;

import java.util.Arrays;
import java.util.Vector;

public class VectorP {
    public static void main(String[] args) {

        Integer[] ar = new Integer[] {23,44};
//        Vector<Integer> v = new Vector<>(20);
        Vector<Integer> v = new Vector<>(Arrays.asList(ar));
//        Add elements to vector
        v.add(10);
        v.add(10);
        v.add(null);
        v.add(null);
        v.add(1,20);
        System.out.println(v);
        System.out.println("size is "+v.size());
        System.out.println("Capacity is "+v.capacity());

        Vector<Integer> v1 = new Vector<>();
        v1.add(100);
        v1.add(200);

        v.addAll(0,v1);
        System.out.println(v);

//        Retrieve element from Vector

        System.out.println("Get "+v.get(0));

        // Verify element in vector

        System.out.println("check values of v1 exists in v "+v.containsAll(v1));

        // Update element in vector

        v.set(0,1000);
        System.out.println(v);

        System.out.println(v.size());
        System.out.println(v.capacity());

        Object[] arr = v.toArray();
        System.out.println(Arrays.toString(arr));

//        Remove elements from vector.

        System.out.println(v);
        v.remove(v1);
        System.out.println(v);

    }
}

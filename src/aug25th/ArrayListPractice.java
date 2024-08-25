package aug25th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class ArrayListPractice {
    public static void main(String[] args) {

        Integer[] ar = new Integer[] {1,4,5};
        ArrayList<Integer> arr = new ArrayList(Arrays.asList(ar));
        arr.add(10);
        arr.add(20);

        System.out.println(arr);

        System.out.println(arr.get(0));
        System.out.println(arr.contains(10));
        System.out.println(arr.set(1,50));
        System.out.println(arr);
        System.out.println(arr.remove(0));
        System.out.println(arr);

        Collections.synchronizedList(arr);



    }
}

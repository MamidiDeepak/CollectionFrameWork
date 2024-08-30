package aug30th.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListP {
    public static void main(String[] args) {

//        List<Integer> l = new ArrayList<>();
        Integer[] ds = new Integer[] {22,32,42};
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(ds));
//        Add elements to Arraylist.
        l.add(10);
        l.add(20);
        l.add(null);
        l.add(0,null);
        l.add(1,100);
        System.out.println(l);

//        Retrieve element from list
        System.out.println(l.get(1));

//        Verify element in list
        System.out.println(l.contains(10));

//        Update element in list
        System.out.println(l.set(1,2000));
        System.out.println(l);

//        remove element from list
        System.out.println(l);
        l.remove(1);
        l.remove(null);
        System.out.println(l);

        System.out.println(l.size());

        Collections.synchronizedList(l);

    }
}

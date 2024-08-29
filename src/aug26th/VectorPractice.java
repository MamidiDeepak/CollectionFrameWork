package aug26th;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {

        Integer[] o = new Integer[] {14,23};
        Vector<Integer> v = new Vector<>(Arrays.asList(o));
        v.add(10);
        v.add(20);
        v.add(0,30);
        System.out.println(v);

//      Add the elements...
        Vector<Integer> v1 = new Vector<>();
        v1.add(40);
        v1.add(50);
//        v.addAll(v1);
//        System.out.println(v);
        v.addAll(1,v1);
        System.out.println(v);


//      Retrieval the elements....
        System.out.println(v.get(0));
        System.out.println(v.get(1));

//      Verification the elements.......
        System.out.println(v.contains(10));
        System.out.println(v.contains(100));
        System.out.println(v.containsAll(v1));

//      Update the Elements.......
        System.out.println(v.set(0, 200));
        System.out.println(v);

//      Remove the Elements.......
        System.out.println(v.remove(0));
        System.out.println(v);
        System.out.println(v.remove(1));
        System.out.println(v);
        System.out.println(v.removeAll(v1));
        System.out.println(v);
    }
}

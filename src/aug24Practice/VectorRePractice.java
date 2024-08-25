package aug24Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Vector;

public class VectorRePractice {
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add("Deepak");
        v.add(0, "raj");
        System.out.println(v);

        Vector v1 = new Vector();
        v1.add("Jaggu");
        v1.add("ram");

        v.addAll(0,v1);
        System.out.println(v);

        Vector v2 = new Vector();
        v2.add("Ganesh");
        v2.add("ramesh");
//
        v.addAll(1,v2);
        System.out.println(v);
//
////        retrieve..
//
//        System.out.println(v.get(1));
//
////        Delete
//        System.out.println(v);
//        v.remove(1);
//        System.out.println(v);
//
//        v.remove("raj");
        System.out.println(v);
//        v.removeAll(v2);
        System.out.println(v);

//        v.clear();
//        System.out.println(v);

//validating

        System.out.println(v.contains("raj"));
        System.out.println(v.containsAll(v2));

v.set(0,"mdh");
        System.out.println(v);

        Object[] arr = v.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(v.size());
        System.out.println(v.capacity());

    }
}

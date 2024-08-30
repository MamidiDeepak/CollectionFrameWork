package com.collectionFrameWork;

import java.util.Arrays;
import java.util.Vector;

public class ListPractice {
    public static void main(String[] args) {

//  When ever you work with collection framework just remember below points..
//  1. Create List/Object.
//  2. Add the elements in the list
//  3. Retrieve the elements from the list
//  4. Verification of elements in the list
//  5. Update the elements in the list
//  6. Delete the elements from the list

        Integer[] arrayValues = new Integer[]{23,54,66};

        Vector v = new Vector(Arrays.asList(arrayValues));
        // Adding of elements...
        v.add(10);
        v.add(20);
        v.add(null);
        v.add(null);
//        v.add(0, 100);
        System.out.println(v);

        Vector v1 = new Vector();
        v1.add(1000);
        v1.add(2000);

//        v.addAll(v1);
//        System.out.println(v);

        v.addAll(0, v1);
        System.out.println(v);

//        Retrieve the element
        System.out.println(v.get(2));

//        Verification of elements in vector / list.

        System.out.println(v.contains(1003));
        System.out.println(v.containsAll(v1));

        // Update the element
        System.out.println(v);
        System.out.println(v.set(5, 2500));
        System.out.println(v);

//        Remove / delete element from list / vector

        v.remove(6);
        System.out.println(v);
        v.removeAll(v1);
        System.out.println(v);

        //It is synchronized
//      Convert vector into array.
            Object[] o = v.toArray();
        System.out.println("array values "+Arrays.toString(o));

    }
}

package com.collectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {
    //  When ever you work with collection framework just remember below points..
//  1. Create List/Object.
//  2. Add the elements in the list
//  3. Retrieve the elements from the list
//  4. Verification of elements in the list
//  5. Update the elements in the list
//  6. Delete the elements from the list

    public static void main(String[] args) {

        Integer[] arrayValues = new Integer[]{23,54,66};
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arrayValues));
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);

//        Not synchronized
        Collections.synchronizedList(al);


    }
}

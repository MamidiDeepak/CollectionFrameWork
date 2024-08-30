package com.collectionFrameWork;

//import aug24Practice.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {

//  When ever you work with collection framework just remember below points..
//  1. Create List/Object.
//  2. Add the elements in the list
//  3. Retrieve the elements from the list
//  4. Verification of elements in the list
//  5. Update the elements in the list
//  6. Delete the elements from the list

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);

        System.out.println(ll.get(0));

        //not synchronized

        Collections.synchronizedList(ll);

    }
}

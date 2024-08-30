package com.collectionFrameWork;

import aug27th.interfacePackage.S;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {


        Stack<String> st = new Stack<>();
        st.push("Red");
        st.push("White");
        st.push("Black");
        System.out.println(st.capacity()); //LIFO

        System.out.println(st.peek());
//        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.search("White"));


    }
}

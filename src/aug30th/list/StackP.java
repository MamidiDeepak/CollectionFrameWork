package aug30th.list;

import aug27th.interfacePackage.S;

import java.util.*;

public class StackP {
    public static void main(String[] args) {

        Stack<String> s = new Stack<>();
        s.add("Red");
//        Add elements to stack
        s.push("Black");
        s.push("White");
        System.out.println(s);

//        View last element
//        System.out.println(s.peek());

//        Remove last element
//        System.out.println(s.pop());

//        Search element in Stack

        System.out.println(s.search("White"));
//        System.out.println(s.search(1));


    }
}

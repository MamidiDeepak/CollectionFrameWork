package aug29th.List.stack;

import java.util.*;

public class stackPractice {
    public static void main(String[] args) {

        String[] su = new String[] {"dog","elephant"};
        Stack<String> s = new Stack<>();

//        Add elements to Stack List
        s.push("Zebra");
        s.push("Hippo");
        System.out.println(s);

//        Check last element
        System.out.println(s.peek());

//        delete last element
//        System.out.println(s.pop());
        System.out.println(s);

//        Search element

        System.out.println(s.search("Hippo"));

    }
}

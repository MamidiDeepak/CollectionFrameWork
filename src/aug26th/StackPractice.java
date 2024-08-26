package aug26th;

import java.util.Collections;
import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {

        Stack<String> s = new Stack<>();
        s.push("Red");
        s.push("black");
        s.push("White");

        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.search("Red"));

        Collections.synchronizedList(s);
    }
}

package aug25th;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {

        Stack<String> s = new Stack<String>();

        s.push("Deepak");
        s.push("Mamidi");
        s.push("QA");

        System.out.println(s.peek());
//        System.out.println(s.pop());
//        System.out.println(s);
        System.out.println(s.search("Deepak"));
        System.out.println(s.indexOf("Deepak"));
        System.out.println(s.isEmpty());
        System.out.println(s.empty());


    }
}

package sep04th.List;

import aug27th.interfacePackage.S;

import java.util.Stack;

public class StackP {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(60);
        s.push(30);
        s.push(80);
        System.out.println(s);

//   retrieve second element
//        System.out.println(s.get(1));
//        System.out.println(s.peek());
//        System.out.println(s.pop());
//        System.out.println(s);

        System.out.println(s.search(10));

    }
}

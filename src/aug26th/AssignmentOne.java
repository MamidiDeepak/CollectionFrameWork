package aug26th;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class AssignmentOne {
    public static void main(String[] args) {
//        Print sum and average of {4,5,0,9,8,10} and
//        output : sum - 36 and average - 6

//        Using ArrayList
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(5);
        al.add(0);
        al.add(9);
        al.add(8);
        al.add(10);

        int sum = 0;

        for(int i=0; i<al.size(); i++){

            sum = sum+al.get(i);
        }
        System.out.println("ArrayList Sum is "+sum);

        int avg = sum/6;
        System.out.println("ArrayList Average is "+avg);

        System.out.println("____________");

//      Using LinkedList....
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(4);
        ll.add(5);
        ll.add(0);
        ll.add(9);
        ll.add(8);
        ll.add(10);

        int sum1 = al.get(0)+al.get(1)+al.get(2)+al.get(3)+al.get(4)+al.get(5);
        System.out.println("LinkedList Sum is "+sum);

        int avg1 = sum/6;
        System.out.println("LinkedList Average is "+avg);

        System.out.println("________");

//      Using Vector....
        Vector<Integer> v = new Vector<>();
        v.add(4);
        v.add(5);
        v.add(0);
        v.add(9);
        v.add(8);
        v.add(10);

        int sum2 = al.get(0)+al.get(1)+al.get(2)+al.get(3)+al.get(4)+al.get(5);
        System.out.println("Vector Sum is "+sum);

        int avg2 = sum/6;
        System.out.println("Vector Average is "+avg);

        System.out.println("________");

//      Using Stack....
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(5);
        s.push(0);
        s.push(9);
        s.push(8);
        s.push(10);

        int sum3 = al.get(0)+al.get(1)+al.get(2)+al.get(3)+al.get(4)+al.get(5);
        System.out.println("Stack Sum is "+sum);

        int avg3 = sum/6;
        System.out.println("Stack Average is "+avg);

    }
}

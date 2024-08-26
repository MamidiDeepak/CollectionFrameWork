package aug26th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {

        Integer[] i = new Integer[] {34,52};
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(i));
        al.add(100);
        al.add(200);
        System.out.println(al);
        al.add(0,300);
        System.out.println(al);

        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(400);
        al1.add(500);

//        System.out.println(al.addAll(al1));
//        System.out.println(al);
        System.out.println(al.addAll(1,al1));
        System.out.println(al);

//      Retrieve....
        System.out.println(al.get(1));

//      Verification.....
        System.out.println(al.contains(100));
        System.out.println(al.containsAll(al1));

//      Update the Element.....
        System.out.println(al.set(0,1000));
        System.out.println(al);

//      Remove the Element.....
        System.out.println(al.remove(0));
        System.out.println(al);
        System.out.println(al.removeAll(al1));
        al.clear();
        System.out.println(al);

        Collections.synchronizedList(al);

    }
}

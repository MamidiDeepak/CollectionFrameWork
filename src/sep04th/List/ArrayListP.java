package sep04th.List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListP {
    public static void main(String[] args) {
//Adding elements
        ArrayList<String> al = new ArrayList<>();

        al.add("Deepak");
        al.add("Mamidi");
        al.add("QA");
        al.add("Engineer");

        System.out.println(al);

//        Retrieving elements

        System.out.println("retrieved "+al.get(3));

//        verify the element
        System.out.println("verified "+al.contains("QA"));

//        Update element
        System.out.println(al.set(1,"Sehwag"));
        System.out.println(al);

//        Remove element

        System.out.println(al.remove(1));
        System.out.println(al);

        Collections.synchronizedList(al);

    }
}

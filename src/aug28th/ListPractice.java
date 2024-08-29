package aug28th;

import java.util.LinkedList;
import java.util.*;

public class ListPractice {
    public static void main(String[] args) {

        List<Integer> l = new LinkedList<>();
//        Add elements to List
        l.add(10);
        l.add(20);
        l.add(30);

        ArrayList<Integer> ds = new ArrayList<>();
        ds.add(342);

        l.addAll(ds);
        System.out.println(l);

//        Retrieve elements from list
        System.out.println(l.get(0));

//        Verify elements from list
        System.out.println(l.contains(20));

//        Update element in the List

        l.set(0,100);
        System.out.println(l.get(0));

//        Delete element from list
        System.out.println(l);
        l.remove(0);
        System.out.println(l);





    }
}

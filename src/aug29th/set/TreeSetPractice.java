package aug29th.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {

        Set<Integer> ts = new TreeSet<>();
//        Add elements to TreeSet
        ts.add(10);
        ts.add(70);
        ts.add(30);
        ts.add(15);
        System.out.println(ts);

//        Verify the elements in the TreeSet
        System.out.println(ts.contains(10));
        System.out.println(ts.contains(30));

//        Remove the elements in the TreeSet
        ts.remove(30);
        System.out.println(ts);

//        Retrieve the elements from the TreeSet

        for(Integer tsf : ts){
            System.out.println(tsf);
        }

//        Other functions
        System.out.println("size is "+ts.size());


    }
}

package aug29th.List.arrayList;

import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {

        String[] arr = new String[] {"dog","eye","nose"};

        ArrayList<String> l = new ArrayList<>(Arrays.asList(arr));
//        Add elements to list
        l.add("arjun");
        l.add("balaram");
        System.out.println(l);
        l.add(0,"krishna");
        System.out.println(l);

//        New ArrayList
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Ganesh");
        l1.add("kumar");
        System.out.println(l1);
        l.addAll(l1);
        System.out.println(l);
        l.addAll(0,l1);
        System.out.println(l);
        System.out.println(l.size());
        System.out.println();

        //retrieve element from ArrayList

        System.out.println(l.get(2));


        //Verification of element in ArrayList

        System.out.println(l.contains("Ganesh"));
        System.out.println(l.containsAll(l1));

//        Update element in ArrayList

        l.set(0,"Umesh");
        System.out.println(l);
        System.out.println(l.isEmpty());

//        Delete element from ArrayList

        System.out.println(l.remove(0));
        System.out.println(l);
        System.out.println(l.removeAll(l1));
        System.out.println(l);

        System.out.println(l1.indexOf("Ganesh"));

        Collections.synchronizedList(l);

       Object[] gh = l.toArray();
        System.out.println(Arrays.toString(gh));
    }
}

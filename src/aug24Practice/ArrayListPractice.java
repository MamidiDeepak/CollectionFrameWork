package aug24Practice;

import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {

////        Dynamic Dispatch...
//       List myList = new ArrayList();
//       myList.add(10);
//       myList.add("Deepak");
//       myList.add('d');
//       myList.add(true);
//       myList.add("sddd"+10);
//        System.out.println(myList);
//
////        Using ArrayList...
//
//        ArrayList b = new ArrayList();
//        b.add(100);
//        b.add("Deepak");
//        b.add(200);
//        b.add(100);
//
//        System.out.println(b);
//
////        ArrayList with Integer only..
//
//        ArrayList<Integer> c = new ArrayList<Integer>();
//        c.add(400);
//        c.add(200);
//        System.out.println(c);
//
//        //        ArrayList with String only..
//
//        ArrayList<String> d = new ArrayList<String>();
//        d.add("Deepak");
//        d.add("Mamidi");
//        System.out.println(d);
//
//        //        ArrayList with float only..
//
//        ArrayList<Float> e = new ArrayList<Float>();
//        e.add(400.323F);
//        e.add(200.1322F);
//        System.out.println(e);

//        Test collections, add, get, remove utilities in ArrayList.

        ArrayList test = new ArrayList();
        test.add(10);
//        test.add("Deepak");
//        test.add(true);
        test.add(20);
//        test.add(2423.433F);
        System.out.println(test);
        System.out.println(test.isEmpty());
        System.out.println("before " +test.get(1));
        test.add(1,"Ganesh");
        System.out.println("after "+test.get(1));
        System.out.println(test);
//        test.clear();
        System.out.println(test);
        test.remove(1);
        System.out.println(test);
        List ju = test.reversed();
        System.out.println(ju);
        System.out.println(test.size());
        List ff = (List) test.clone();
        System.out.println(ff);
        System.out.println(test.contains("deepak"));
        System.out.println("_____________");
        for(Object alfa : test){
            System.out.println(alfa);
        }
        System.out.println("_____");

        Iterator af = test.iterator();
        while (af.hasNext()){
            System.out.println(af.next());
        }

        Collections.sort(test);
        System.out.println(test);

        Collections.sort(test, Comparator.reverseOrder());
        System.out.println(test);


    }
}

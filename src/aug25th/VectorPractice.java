package aug25th;

import java.util.Arrays;
import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {

//        Vector v = new Vector();
//        v.add(10);
//        v.add("Deepak");
////        v.add("Deepak");
//        v.add(true);
//        v.add(1,"Kiran");
//        System.out.println(v);
//        List Created......
//        Elements added to List........

//        Vector v1 = new Vector();
//        v1.add("Umesh");
//        v1.add("Girish");
//        v1.add("guru");
//        v1.add("raju");

//        System.out.println(v);
//        v.addAll(v1);
//        System.out.println(v);
////        v.addAll(0,v1);
//        System.out.println(v);

//        Retrieval of elements from List

//        System.out.println(v.get(0));
//        System.out.println(v.getFirst());
//        System.out.println(v.getLast());
//        System.out.println(v.getClass());

//      Validating the elements in List

//        System.out.println(v.contains("Deepak"));
//        System.out.println("check v1 values existing in v "+v.containsAll(v1));
//        System.out.println(v1.size());
//        System.out.println(v1.capacity());

//        Updation of elements in List

//        System.out.println(v);
//        System.out.println(v.set(0,"khan"));
//        System.out.println(v.size());
//        System.out.println(v.indexOf("Deepak"));
//        System.out.println(v.lastIndexOf("Deepak"));
//        System.out.println(v1.firstElement());
//        System.out.println(v1.lastElement());
//        Object[] ob = v1.toArray();
//
//        System.out.println(Arrays.toString(ob));


//        System.out.println(v.remove(1));
//        System.out.println(v);
//        System.out.println(v.remove("Girish"));
//        System.out.println(v);
//        System.out.println(v.removeAll(v1));
//        System.out.println(v);
//        v.clear();
//        System.out.println(v);

        Object[] bh = new Object[] {1,3,4,5};
        Vector v3 = new Vector(Arrays.asList(bh));
//        v3.add(10);
//        v3.add("Deepak");
////        v.add("Deepak");
//        v3.add(true);
        System.out.println(v3);
        System.out.println(v3.size());
        System.out.println(v3.capacity());
        for(int i=0; i<v3.size(); i++){
            System.out.print(v3.get(i));
            System.out.print(",");
        }
    }
}

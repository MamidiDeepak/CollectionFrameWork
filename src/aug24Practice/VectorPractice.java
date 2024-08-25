package aug24Practice;

import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {

        Vector v = new Vector();

        v.add("deepak");
        v.add("Ram");
        v.add("kishan");
        v.add("virat");
        v.add("raj");
        v.add("umesh");
        v.add(2,"ganesh");
        System.out.println(v);

        Vector v1 = new Vector();
        v1.add("andrew");
        v1.add("Gill");
        System.out.println(v1);

        System.out.println(v);
        v.addAll(0,v1);
        System.out.println(v);

        System.out.println(v1);
//        v1.remove(1);
//        v1.remove("Gill");

        System.out.println(v);
//        v.removeAll(v1);
        System.out.println(v);

        System.out.println(v1);
//        v1.clear();
        System.out.println(v1);

        System.out.println(v1.contains("Gill"));

        System.out.println(v1);
        Vector v2 = new Vector();
        v2.add("Gill");
        v2.add("Andrew");
        System.out.println(v2);

        System.out.println(v);
        v.addAll(v2);
        System.out.println(v.containsAll(v2));


    }
}

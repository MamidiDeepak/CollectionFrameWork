package aug29th.List.vector;

import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector(10);
//        Add elements to List
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);
        v.add(70);
        v.add(80);
        v.add(90);
        v.add(100);
        v.add(110);
        v.add(4,500);

        System.out.println(v);
        System.out.println("Size of the list "+v.size());
        System.out.println("Capacity of the list "+v.capacity());

//        Retrieve the Elements from the List

        System.out.println(v.get(0));
        System.out.println(40);
        System.out.println(v.getFirst());
        System.out.println(v.getLast());

//        Verification of elements in the List

        System.out.println(v.contains(50));
        System.out.println(v.contains(50));
        System.out.println(v.contains(4));
        System.out.println(v.contains(500));

//    creating new vector object
        Vector<Integer> v1 = new Vector<>();
        v1.add(900);
        v1.add(300);

        v.addAll(v1);
        System.out.println(v);
        v.addAll(0,v1);
        System.out.println(v);

        System.out.println(v.containsAll(v1));

//        Update the element in List
        v.set(0,1000);
        System.out.println(v);

//        Remove element from List

        v.remove(9);
        System.out.println(v);
        v.removeAll(v1);
        System.out.println(v);
        v.remove(0);
        System.out.println(v);

    }
}

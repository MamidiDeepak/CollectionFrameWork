package aug26th;

import java.util.ArrayList;

public class AssignmentThree {
    public static void main(String[] args) {
//        Split List {4,5,0,9,8,10} into Two lists.
//        Output list1 (4,5,0} and list2 {9,8,10}

//        Using ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(0);

        for(int i=0; i<list1.size(); i++){

            System.out.print(list1.get(i)+" ");
        }

        System.out.println( );

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(8);
        list2.add(10);

        for(int i=0; i<list2.size(); i++){

            System.out.print(list2.get(i)+" ");
        }

    }
}

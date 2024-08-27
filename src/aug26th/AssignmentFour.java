package aug26th;

import java.util.ArrayList;

public class AssignmentFour {
    public static void main(String[] args) {
//        merge 2 lists (4,9,8} and list2 {5,0,10}
//        int one list {4,9,8,5.0,10}

//        Using ArrayList...
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(9);
        list1.add(8);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(0);
        list2.add(10);

        list1.addAll(list2);
        System.out.println("Combined list is : "+list1);


    }
}

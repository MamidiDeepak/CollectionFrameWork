package aug26th;

import java.util.ArrayList;

public class AssignmentSix {
    public static void main(String[] args) {

//        Find the highest number of duplicate elements in a list
//        {4,1,9,4,8,0,5,8,1,8,6}
//        output : 8

        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(1);
        al.add(9);
        al.add(4);
        al.add(8);
        al.add(0);
        al.add(5);
        al.add(8);
        al.add(1);
        al.add(8);
        al.add(6);

        int num = al.get(4);

        for (int i = 0; i < al.size(); i++) {
            if (al.get(i)==num){
                System.out.println(al.get(i));
            }
        }
    }
}

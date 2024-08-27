package aug26th;

import java.util.ArrayList;

public class AssignmentTwo {
    public static void main(String[] args) {
//        Print sum of Even numbers of {4,5,0,9,8,10} and
//        output : 22

//        Using ArrayList
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(5);
        al.add(0);
        al.add(9);
        al.add(8);
        al.add(10);

        int ev = 0;

        for(int i=0; i<al.size(); i++){

            if(al.get(i)%2==0){
                ev=ev+al.get(i);
            }
        }
        System.out.println("ArrayList Sum value is"+ev);
    }
}

package aug26th;

import java.util.ArrayList;

public class AssignmentFifth {
    public static void main(String[] args) {

//         {baby, ball, soap, baby, shampoo, chalk, soap, makeup, baby, lotion}
//        output baby-3 times and soap-2 times

        ArrayList<String> list = new ArrayList<>();
        list.add("baby");
        list.add("ball");
        list.add("soap");
        list.add("baby");
        list.add("shampoo");
        list.add("chalk");
        list.add("soap");
        list.add("makeup");
        list.add("baby");
        list.add("lotion");

//        System.out.println(list.contains("baby"));

        for(int i=0; i<list.size(); i++) {
            if (list.get(i) == "baby") {
                System.out.println("baby");
            }
        }
        System.out.println("_____");
        for(int j=0; j<list.size(); j++) {
            if (list.get(j) == "soap") {
                System.out.println("soap");
            }
        }
    }
}

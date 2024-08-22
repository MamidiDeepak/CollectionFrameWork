package aug22nd;

import java.util.ArrayList;
import java.util.List;

public class ArrayClassTest {

    public static void main(String[] args) {

        List myList = new ArrayList();
        myList.add(1);
        myList.add("Deepak");
        myList.add(true);
        myList.add("112asd");
        System.out.println(myList.contains("Deepak"));
        System.out.println(myList);

        myList.remove(1);
//        myList.clear();
        System.out.println(myList.contains("Deepak"));

//        myList.clear();
        System.out.println(myList.isEmpty());

        myList.set(1, "ram");

        try {

//            System.out.println(myList.get(1));
        }catch (IndexOutOfBoundsException ae){
//            System.out.println("Value does not exists");
        }

        List e = List.of("Deepak", "Mamidi", "umesh");
//        System.out.println(e);

    }
}

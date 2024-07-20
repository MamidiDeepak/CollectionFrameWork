package ex_20072024;

public class Lab098 {

    public static void main(String[] args) {


        int itemCode = 105;

        switch (itemCode){

            case 102, 105 -> System.out.println("matching line 1");
            case 103, 104 -> System.out.println("matching line 2");
            default -> System.out.println("not matching any value");
        }
    }
}

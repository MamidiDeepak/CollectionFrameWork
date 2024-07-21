package ex_21072024;

public class Lab111 {
    public static void main(String[] args) {
//        without expression

        for (int i = 0; ; i++) {
            System.out.println(i);

            //        without 2 expressions
            for (int j = 0; ; ) {
                System.out.println("with only j");

                //        without 3 expressions

                for (; ; ) {
                    System.out.println("hi");
                }
            }
        }
    }
}

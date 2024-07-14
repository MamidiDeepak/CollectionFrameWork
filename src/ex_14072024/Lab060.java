package ex_14072024;

public class Lab060 {
    public static void main(String[] args) {

        int a = 10;

//        System.out.println(++a);
//        System.out.println(a);

//        System.out.println(a++);
//        System.out.println(a);

//        System.out.println(a + ++a + ++a + a++ + a);
        // 10 + 11 + 12 + 12 + 13 = 58

//        System.out.println(a + --a + --a + a-- + a);
//        10 + 9 + 8 + 8 + 7 = 42

        System.out.println(a + --a + --a + a-- + a + ++a + a++ +a);
//        10 + 9 + 8 + 8 + 7 + 8 + 8 +9 = 67

    }
}

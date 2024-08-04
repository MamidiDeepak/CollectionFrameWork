package ATB7xPackage;

public class Lab009 {

    int a = 2;
    int b = 3;
    int c;

    public void swapNumber(){

        c = b;
        b = a;

    }

    public static void main(String[] args) {

        Lab009 c = new Lab009();
        c.swapNumber();

        System.out.println("c value is : "+c.c);
        System.out.println("b value is : "+c.b);
    }
}

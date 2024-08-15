package aug15thCompleteOopsPractice.Abstraction;

public class RunClass {
    public static void main(String[] args) {

        Tesla t = new Tesla();
        t.drive();
        t.jumpStartTheCar();
        System.out.println("_________");
        Swift s = new Swift();
        s.drive();

    }
}

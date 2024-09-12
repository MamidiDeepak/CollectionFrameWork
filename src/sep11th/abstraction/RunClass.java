package sep11th.abstraction;

public class RunClass extends Maruti {
    public static void main(String[] args) {

        Maruti m = new Maruti();
        m.drive();
        System.out.println("_______________");
        Tesla t = new Tesla();
        t.drive();

        Gears g = new Tesla();
        g.abc();
    }
}
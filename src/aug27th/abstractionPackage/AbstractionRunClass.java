package aug27th.abstractionPackage;

public class AbstractionRunClass {
    public static void main(String[] args) {

        Tesla t = new Tesla();
        t.startEngine();
        System.out.println("________");
        volvo v = new volvo();
        v.startEngine();
    }
}

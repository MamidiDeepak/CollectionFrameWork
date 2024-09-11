package sep11th.polymorphismPackage;

public class RunClass {
    public static void main(String[] args) {

        ClassA a = new ClassA("a");
        a.alfa("Deepak");

        OverRideAClass orbc = new OverRideAClass();
        orbc.home();

        OverRideAClass orbc1 = new OverRideBClass();
        orbc1.home();
    }
}

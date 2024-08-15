package aug14thAbstractionPractice;

public class AbstractionRunClass {
    public static void main(String[] args) {

        TeslaModel t = new TeslaModel();
        t.keys();
        t.Start();
        t.gearsInCar();
        t.Stop();
        t.extraEngine();

        System.out.println("_____________");

        kiaModel k = new kiaModel();
        k.keys();
        k.Start();
        k.gearsInCar();
        k.Stop();
        k.extraEngine();
    }
}

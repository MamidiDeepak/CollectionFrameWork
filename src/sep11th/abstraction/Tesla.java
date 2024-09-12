package sep11th.abstraction;

public class Tesla extends Engine{

    void drive(){
        keysToStart();
        startEngine();
        stopEngine();
        gearBox();
        brakes();
    }

    @Override
    void startEngine() {
         System.out.println("Tesla no keys to start engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Tesla no keys to stop engine");
    }

    @Override
    void brakes() {
        System.out.println("Tesla has auto braking system");
    }

    @Override
    void gearBox() {
        System.out.println("Tesla cars has 0 gears");
    }

    @Override
    void keysToStart() {
        System.out.println("Tesla cars does not need keys to start");
    }
}

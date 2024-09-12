package sep11th.abstraction;

public class Maruti extends Engine{

    void drive(){
        keysToStart();
        startEngine();
        stopEngine();
        gearBox();
        brakes();
    }

    @Override
    void startEngine() {
        System.out.println("rotate keys to start engine");
    }

    @Override
    void stopEngine() {
        System.out.println("rotate keys to stop engine");
    }

    @Override
    void brakes() {
        System.out.println("Maruti has manual braking system");
    }

    @Override
    void gearBox() {
        System.out.println("Maruti cars have 5 gears");
    }

    @Override
    void keysToStart() {
        System.out.println("Maruti cars need keys to start");
    }
}

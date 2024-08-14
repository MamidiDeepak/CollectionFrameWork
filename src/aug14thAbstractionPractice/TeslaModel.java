package aug14thAbstractionPractice;

public class TeslaModel extends  Engine{


    @Override
    void Start() {
        System.out.println("starts automatically when doors closed");
    }

    @Override
    void Stop() {
        System.out.println("stops automatically when doors closed");
    }

    @Override
    void gearsInCar() {
        System.out.println("Tesla has auto gear System");
    }

    @Override
    void keys() {
        System.out.println("Tesla does not required keys");
    }
}

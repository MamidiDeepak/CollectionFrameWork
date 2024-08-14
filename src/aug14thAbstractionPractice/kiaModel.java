package aug14thAbstractionPractice;

public class kiaModel extends  Engine{


    @Override
    void Start() {
        System.out.println("Car gets start by keys insertion");
    }

    @Override
    void Stop() {
        System.out.println("Car gets stop when keys removed");
    }

    @Override
    void gearsInCar() {
        System.out.println("Kia has auto and manual gear System");
    }

    @Override
    void keys() {
        System.out.println("Kia required keys");
    }
}

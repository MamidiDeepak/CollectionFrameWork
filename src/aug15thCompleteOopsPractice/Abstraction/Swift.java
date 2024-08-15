package aug15thCompleteOopsPractice.Abstraction;

public class Swift extends Engine{

    void drive(){
        keysToStartCar();
        startCar();
        gearSwitch();
        stopCar();
        speed();
        jumpStart();
    }
    @Override
    void startCar() {

    }

    @Override
    void stopCar() {

    }

    @Override
    void speed() {
        System.out.println("Swift speed is average.");
    }

    @Override
    void gearSwitch() {
        System.out.println("Swift has manual gears");
    }

    @Override
    void keysToStartCar() {

    }
}

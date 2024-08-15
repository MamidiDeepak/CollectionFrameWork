package aug15thCompleteOopsPractice.Abstraction;

public class Tesla extends Engine{

    void drive(){
        keysToStartCar();
        startCar();
        gearSwitch();
        stopCar();
        speed();
    }

    void jumpStartTheCar(){
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
        System.out.println("Tesla speed is very high");
    }

    @Override
    void gearSwitch() {
        System.out.println("Tesla has automatic gears");
    }

    @Override
    void keysToStartCar() {

    }
}

package aug15thCompleteOopsPractice.Abstraction;

abstract class Engine extends Gears{
    abstract void startCar();
    abstract void stopCar();
    abstract void speed();

    void jumpStart(){
        System.out.println("Sometimes car gets jump Start");
    }
}

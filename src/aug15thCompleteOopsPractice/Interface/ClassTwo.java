package aug15thCompleteOopsPractice.Interface;

public class ClassTwo implements  ClassOne{
    @Override
    public void startEngine() {
        System.out.println("Car started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car stopped");
    }
}

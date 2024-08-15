package aug15thInterface;

public class InterfaceSecondClass implements InterfaceFirstClass {

    void drive(){
        startEngine();
        stopEngine();
    }

    @Override
    public void startEngine() {
        System.out.println("Engine Started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");
    }
}

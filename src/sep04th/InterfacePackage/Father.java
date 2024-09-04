package sep04th.InterfacePackage;

public interface Father {

    public void loan();
    public void home();

    default void test(){
        System.out.println("From default method");
    }

    static void test1(){
        System.out.println("from static method");
    }

}

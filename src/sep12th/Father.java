package sep12th;

public interface Father{
    void home();
    void money();

    default void defaultMethod(){
        System.out.println("From default method");
    }

    static void staticMethod(){
        System.out.println("From static method");
    }
}

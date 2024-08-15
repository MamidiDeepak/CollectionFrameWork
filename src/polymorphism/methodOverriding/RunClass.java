package polymorphism.methodOverriding;

public class RunClass {
    public static void main(String[] args) {

        ClassTwo ct = new ClassTwo();
        ct.Dog();

        ClassOne co = new ClassTwo();
        co.Dog();

        ClassOne cok = new ClassOne();
        cok.Dog();
    }
}

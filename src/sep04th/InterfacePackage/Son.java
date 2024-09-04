package sep04th.InterfacePackage;

public class Son implements Mother,Father {

    @Override
    public void home() {
        System.out.println("I am staying in my Father's home.");
    }

    @Override
    public void loan() {
        System.out.println("I am paying my Parents loan.");
    }


//
//    {
//        System.out.println("IIB Method");
//    }
//
//    static {
//        System.out.println("Static method");
//    }
}

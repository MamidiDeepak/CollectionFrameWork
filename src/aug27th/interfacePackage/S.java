package aug27th.interfacePackage;

public class S implements M,F{

    @Override
    public void home() {
        System.out.println("I am staying in my father home.");
    }

    @Override
    public void loan() {
        System.out.println("I am paying my parents loan.");
    }

    {
        System.out.println("This is IIB block.");
    }

    static {
        System.out.println("This is static block.");
    }
}

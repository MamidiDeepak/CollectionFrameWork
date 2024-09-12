package sep12th;

public class Son implements Father,Mother{
    @Override
    public void home() {
        System.out.println("I am staying in parents home");
    }

    @Override
    public void money() {
        System.out.println("I am using my Father's money");
    }

    {
        System.out.println("IIB method");
    }

    static {
        System.out.println("I am static");
    }
}

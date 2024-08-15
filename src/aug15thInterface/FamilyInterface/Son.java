package aug15thInterface.FamilyInterface;

public class Son implements Father,Mother {
    @Override
    public void loan() {
        System.out.println("I am paying mother and Father pending loans");
    }

    @Override
    public void loan(String name) {
        System.out.println("father name is "+name);
    }

    @Override
    public void loan(int age) {
        System.out.println("mother age is "+age);
    }

    @Override
    public void home() {
        System.out.println("And I am staying in my Parents Home.");
    }
    {
        System.out.println("This is my block");
    }

    static {
        System.out.println("this is my static block");
    }

}

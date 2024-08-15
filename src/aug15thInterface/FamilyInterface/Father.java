package aug15thInterface.FamilyInterface;

public interface Father {

    void loan();
    void loan(String name);
    void home();

    default void flat(){
        System.out.println("As a father. I own a flat");
    }

    static void plot(){
        System.out.println("As a father. I own a plot as well");
    }
}

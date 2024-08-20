package aug16thCompletePracticeOfOops.Abstraction;

public class RunClass {
    public static void main(String[] args) {

        SuperHouse h = new SuperHouse();
        h.houses();
        System.out.println("__________");
        SuperHouse h1 = new SuperHouse();
        h1.houses();

        System.out.println("___________");
        SimpleHouse sh = new SimpleHouse();
        sh.SlabHouses();

    }
}

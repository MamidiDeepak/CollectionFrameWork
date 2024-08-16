package aug16thCompletePracticeOfOops.Abstraction;

public class SuperHouse extends UltraLuxury{

    void houses(){
        SlabHouses();
        luxuryHouses();
        AsbestosHouses();
    }
    @Override
    void SlabHouses() {
        System.out.println("I am in slab house");
    }

    @Override
    void luxuryHouses() {
        System.out.println("I am in luxury house");
    }

    @Override
    void AsbestosHouses() {
        System.out.println("I am in asbestos house");
    }
}

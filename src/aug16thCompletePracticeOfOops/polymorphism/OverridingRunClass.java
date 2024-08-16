package aug16thCompletePracticeOfOops.polymorphism;

public class OverridingRunClass {
    public static void main(String[] args) {

        SonOverriding sono = new SonOverriding();
        sono.home();

        MotherOverriding ds = new MotherOverriding();
        ds.home();

        MotherOverriding fe = new SonOverriding();
        fe.home();
    }
}

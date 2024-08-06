package testPackage_08052024.singleInheritance;

public class SingleInheritance {

    public static void main(String[] args) {

        SonClass scls = new SonClass("Amit", 30, "raj", 45);

        scls.sonMethod();

        System.out.println();

        scls.fatherMethod();
    }
}

package testPackage_08052024;

import java.util.Scanner;

public class SingleInheritance {

    public static void main(String[] args) {

        SonClass scls = new SonClass("Amit", 30, "raj", 45);
//        System.out.println(scls.sonName);
//        System.out.println(scls.sonAge);
        scls.sonMethod();

        System.out.println();
//        System.out.println(scls.fatherName);
//        System.out.println(scls.fatherAge);
        scls.fatherMethod();
    }
}

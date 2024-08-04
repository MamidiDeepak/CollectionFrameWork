package ex_04082024;

import java.util.Scanner;

public class Lab_162RunClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter carName...");
        String crName = sc.next();
        System.out.println("enter carModelYr...");
        int crModel = sc.nextInt();

        Lab_162 lb = new Lab_162(crName, crModel);
        System.out.println(lb.carName);
        System.out.println(lb.carModelYear);
//        System.out.println();
        lb.accelerate();
        lb.brakes();

        Lab_162 lb1 = new Lab_162(crName, crModel);
        System.out.println();
        System.out.println(lb1.carName);
        System.out.println(lb1.carModelYear);
//        System.out.println();
        lb1.accelerate();
        lb1.brakes();

        Lab_162 lb2 = new Lab_162(crName, crModel);
        System.out.println();
        System.out.println(lb2.carName);
        System.out.println(lb2.carModelYear);
//        System.out.println();
        lb1.accelerate();
        lb1.brakes();

    }

}

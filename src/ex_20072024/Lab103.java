package ex_20072024;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check +ve or -Ve");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("it is +ve");
        } else if (num<0) {
            System.out.println("It is -Ve");
        }else {
            System.out.println("It is 0");
        }
    }
}

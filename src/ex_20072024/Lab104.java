package ex_20072024;

import java.util.Scanner;

public class Lab104 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first value");
        int num1 = sc.nextInt();

        System.out.println("enter second value");
        int num2 = sc.nextInt();

        System.out.println("enter third value");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("number-1 is greater");
        } else if (num2>num3 && num2>num3) {
            System.out.println("number-2 is greater");
        }else {
            System.out.println("number-3 is greater");
        }
    }
}

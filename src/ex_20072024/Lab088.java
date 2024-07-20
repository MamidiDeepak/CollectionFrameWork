package ex_20072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {

//        max number from two input number

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();

        System.out.println("enter second number");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("number num1 is bigger");
        }else if(num2 > num1){
            System.out.println("number num2 is bigger");
        }else{
            System.out.println("both numbers are equal");
        }
    }
}

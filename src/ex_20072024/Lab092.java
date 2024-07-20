package ex_20072024;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {

//        Get the day in a week by there index value.....

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your day number..");
        int dayValue = sc.nextInt();

        switch (dayValue){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;
            case 3 :
                System.out.println("wednesday");
                break;
            case 4 :
                System.out.println("thursday");
                break;
            case 5 :
                System.out.println("friday");
                break;
            case 6 :
                System.out.println("saturday");
                break;
            case 7 :
                System.out.println("sunday");
                break;
            default:
                System.out.println("not index does not match");


        }
    }
}

package ex_20072024;

import java.util.Scanner;

public class HomeWork20July {
    public static void main(String[] args) {
//        Leap Year Program....

//        boolean isLeapYear = false;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter year");
//        int year = sc.nextInt();
//
//        if(year%4 == 0 && year%100 != 0){
//            isLeapYear = true;
//        }
//
//        if(isLeapYear){
//            System.out.println("is leap year");
//        }else {
//            System.out.println("not leap year");
//        }

//      Find the triangle...

//        int side1 = 5;
//        int side2 = 6;
//        int side3 = 4;
//
//        if(side1==side2 && side1==side3 && side2==side3){
//            System.out.println("it is equilateral triangle");
//        } else if (side1==side2 || side2==side3 || side3==side1) {
//            System.out.println("It is isoceles triangle");
//        }else {
//            System.out.println("it is scalable triangle");
//        }

//        Grading Program....

//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59

//        Scanner scn = new Scanner(System.in);
//        System.out.println("enter marks...");
//        int marks = scn.nextInt();
//
//        if(marks>=90 && marks<=100){
//            System.out.println("Grade A");
//        } else if (marks>=80 && marks<=89) {
//            System.out.println("Grade B");
//        } else if (marks>=70 && marks<=79) {
//            System.out.println("Grade C");
//        } else if (marks>=60 && marks<=69) {
//            System.out.println("Grade D");
//        } else if (marks>=0 && marks<=59) {
//            System.out.println("Grade F");
//        }

//        FizzBuzz program

       for(int i=0; i<=100; i++){
           if(i%3 == 0 && i%5 == 0){
               System.out.println("FizzBuzz");
           } else if (i%3==0) {
               System.out.println("Fizz");
           } else if (i%5==0) {
               System.out.println("Buzz");
           }else{
               System.out.println(i);
           }
       }

    }
}

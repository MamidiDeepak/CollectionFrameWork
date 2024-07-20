package ex_20072024;

import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
//        prac - 1

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your age....");
//        int age = sc.nextInt();
//
//        if(age == 18){
//
//            System.out.println("Allowed to vote.");
//        }else{
//            System.out.println("Not allowed to vote.");
//        }

//        prac - 2
//        int a = 11;
//
//        if(a == 10){
//            System.out.println("equal");
//        }else {
//            System.out.println("Not equal");
//        }

//        prac - 3

//        boolean a = true;
//
//        if(!a){
//            System.out.println("true");
//        }else
//        {
//            System.out.println("false");
//        }

//        Prac - 4
//
//        if(2+2 > 4){
//            System.out.println("Matching");
//        }else{
//            System.out.println("Not matching");
//        }

//        Prac - 5

//        int a = 11;
//
//        if(a%2 == 0){
//            System.out.println("even");
//        }else {
//            System.out.println("odd");
//        }

//        Parc - 6
//      Scanner scn = new Scanner(System.in);
//        System.out.println("enter your number");
//        int a = scn.nextInt();
//
//        if(a%2 == 0){
//            System.out.println("even");
//        }else {
//            System.out.println("odd");
//        }

//        prac - 7

//        Scanner scn = new Scanner(System.in);
//        System.out.println("enter your first number");
//        int a = scn.nextInt();
//
//        System.out.println("enter your second number");
//        int a1 = scn.nextInt();
//
//        if(a>a1){
//            System.out.println(a+ "value is greater");
//        }else if(a<a1){
//            System.out.println(a1+" value is greater");
//        }else{
//            System.out.println(a+ " and " +a1+ " both values are equal");
//        }

//        Prac - 8
//
//         ✅ Grade Calculator:
//        Write a program that calculates and displays
//        the letter grade for a given numerical
//        score (e.g., A, B, C, D, or F)
//        based on the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to get grade");
        int score = sc.nextInt();

        if(score>=90 && score<=100) {
            System.out.println("Grade A");
        } else if ((score>=80 && score<=89)) {
            System.out.println("Grade B");
        } else if ((score>=70 && score<=79)) {
            System.out.println("Grade C");
        } else if ((score>=60 && score<=69)) {
            System.out.println("Grade D");
        }else if((score>=0 && score<=59)){
            System.out.println("Grade F");
        }

    }
}

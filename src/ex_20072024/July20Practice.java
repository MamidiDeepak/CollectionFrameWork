package ex_20072024;

import java.util.Scanner;

public class July20Practice {
    public static void main(String[] args) {
//        Even or odd

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number to validate even or odd");
//        int num = sc.nextInt();
//
//        if(num%2 == 0){
//            System.out.println("it is even");
//        }else {
//            System.out.println("it is odd");
//        }

//        max number between 2 numbers.....
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter first number");
//        int num1 = sc.nextInt();
//
//        System.out.println("enter Second number");
//        int num2 = sc.nextInt();
//
//        if(num1>num2){
//            System.out.println("first number is greater");
//        } else if (num2>num1) {
//            System.out.println("second number is greater");
//        }else {
//            System.out.println("both are equal");
//        }

//        find vowel or not

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter character");
//        char ch = sc.next().charAt(0);
//
//        switch (ch){
//
//            case 'a' :
//                System.out.println("vowel");
//                break;
//            case 'e' :
//                System.out.println("vowel");
//                break;
//            case 'i' :
//                System.out.println("vowel");
//                break;
//            case 'o' :
//                System.out.println("vowel");
//                break;
//            case 'u' :
//                System.out.println("vowel");
//                break;
//            default:
//                System.out.println("it is consonant");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter value");
//        int ch = sc.nextInt();
//
//        switch (ch){
//            case 100,101,102 :
//                System.out.println("value matching");
//                break;
//            default:
//                System.out.println("value does not match");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter character");
//        char ch = sc.next().charAt(0);
//
//        if(ch == 'a' || ch == 'e' || ch =='i' || ch=='o' || ch=='u'){
//            System.out.println("it is vowel");
//        }else
//        {
//            System.out.println("not vowel");
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter character");
//        char ch = sc.next().charAt(0);
//
//        switch (ch){
//            case 'a' -> System.out.println("vowel");
//            case 'e' -> System.out.println("vowel");
//            default -> System.out.println("consonant");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter character");
        char ch = sc.next().charAt(0);

        switch (ch){
            case 'a','e':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }

    }
}

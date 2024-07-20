package ex_20072024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character.. let's find it is vowel or not");
    char ch = sc.next().charAt(0);

    switch (ch){
        case 'a' :
            System.out.println("It is vowel.");
            break;
        case 'e' :
            System.out.println("It is vowel.");
            break;
        case 'i' :
            System.out.println("It is vowel.");
            break;
        case 'o' :
            System.out.println("It is vowel.");
            break;
        case 'u' :
            System.out.println("It is vowel.");
            break;
        default:
            System.out.println("It is consonant");

    }

    switch (ch){
        case 'a','e','i','o','u' :
            System.out.println("Yes. It is vowel in one line");
            break;
        default:
            System.out.println("No. It is a consonant in one line");
    }

    }
}

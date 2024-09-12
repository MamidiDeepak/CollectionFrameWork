package sep12thPracticePrograms;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

//        Print Given number is even or odd

        System.out.println("enter value to check even or odd.");
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();

        if(a%2==0){
            System.out.println("Entered value is even");
        }else {
            System.out.println("Entered value is odd");
        }




    }
}

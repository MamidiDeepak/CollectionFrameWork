package sep12thPracticePrograms;

import java.util.Scanner;

public class FindResult {
    public static void main(String[] args) {

        //        Verify the student interview process

        System.out.println("Enter student Interview result Pass/Fail");
        Scanner scr = new Scanner(System.in);
        String result = scr.next();

        if (result.equalsIgnoreCase("Pass")) {
//            System.out.println("Processed for round-1");
            System.out.println("Enter round-1 result");
            Scanner scr1 = new Scanner(System.in);
            String result1 = scr1.next();
            if (result1.equalsIgnoreCase("Pass")) {
//                System.out.println("Processed for HR Round");
                System.out.println("Enter HR round result");
                Scanner scr2 = new Scanner(System.in);
                String result2 = scr2.next();
                if (result2.equalsIgnoreCase("Pass")) {
                    System.out.println("Selected For QA job");
                } else {
                    System.out.println("You can go home after HR round");
                }
            } else {
                System.out.println("You can go home after round-1");
            }
        } else {
            System.out.println("Failed! Please, you can go home");
        }
    }
}
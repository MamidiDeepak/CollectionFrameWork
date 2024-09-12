package sep12thPracticePrograms;

import java.util.Scanner;

public class FindingResultBasedOnGrade {
    public static void main(String[] args) {

//  <35 - fail
//  ==35 - pass
//  35 to 70 - third class
//  70 to 85 - second class
//  >85 first class

        System.out.println("Enter marks will give Grade.");
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();

        if(a<35){
            System.out.println("Failed");
        } else if (a==35) {
            System.out.println("pass");
        } else if (a>35 && a<70) {
            System.out.println("Third class");
        } else if (a>70 && a<85) {
            System.out.println("Second class");
        }else {
            System.out.println("First Class");
        }

    }
}

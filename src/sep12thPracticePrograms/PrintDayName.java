package sep12thPracticePrograms;

import aug27th.interfacePackage.S;
import sep12th.Son;

import java.util.Scanner;

public class PrintDayName {
    public static void main(String[] args) {
//        Monday to Friday -> Uff, it's a Weekday
//        Saturday & Sunday -> Yayy, it's a Weekend

        System.out.println("Enter Day name to show is it weekday or weekend.");
        Scanner sc = new Scanner(System.in);
        String dayName = sc.next();

        if(dayName.equalsIgnoreCase("Monday")){
            System.out.println("Uff, it's a Weekday "+dayName);
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println("Uff, it's a Weekday "+dayName);
        } else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println("Uff, it's a Weekday "+dayName);
        }else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println("Uff, it's a Weekday "+dayName);
        }else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println("Uff, it's a Weekday "+dayName);
        }else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println("Yayy, it's a Weekend "+dayName);
        }else {
            System.out.println("Yayy, it's a Weekend "+dayName);
        }


    }
}

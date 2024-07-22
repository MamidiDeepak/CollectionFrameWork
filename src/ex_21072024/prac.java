package ex_21072024;

public class prac {
    public static void main(String[] args) {

        for(int i=0; i<=50;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }

        int year = 2024;

        boolean isLeapYear = false;

        if(year%4==0 && year%100!=0){
            isLeapYear = true;
        }

        if(isLeapYear){
            System.out.println("It is leapyear");
        }else{
            System.out.println("not leap year");
        }

        int side1 = 3;
        int side2 = 5;
        int side3 = 4;

        if(side1==side2 && side1==side3 && side2==side3){
            System.out.println("it is equilateral triangle");
        } else if (side1==side2 || side2==side3) {
            System.out.println("It is isoceles triangle");
        }else {
            System.out.println("It is scalable triangle");
        }

    }
}

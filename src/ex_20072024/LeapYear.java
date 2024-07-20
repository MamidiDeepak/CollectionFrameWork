package ex_20072024;

public class LeapYear {
    public static void main(String[] args) {

      boolean isLeapYear = false;

      int year = 2028;

      if(year%2 ==0 && year%100 != 0 || year%400 == 0){
          isLeapYear = true;
      }

      if(isLeapYear){
          System.out.println("It is leapYear");
      }else
          System.out.println("It is not leapYear");
    }
}

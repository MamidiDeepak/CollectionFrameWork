package ex_14072024;

public class Lab058 {
    public static void main(String[] args) {

        int course = 100;
        float my_data = 18.45F;

        int totalValue = course + (int)my_data;
        float totalValue1 = course + (float)my_data;

        System.out.println("narrowing with int "+totalValue);
        System.out.println("narrowing with float "+totalValue1);
    }
}

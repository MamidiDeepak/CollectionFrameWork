package ex_20072024;

public class TriangleClassifier {
    public static void main(String[] args) {

        int side1 = 4;

        int side2 = 4;
        int side3 = 2;

        if(side1 == side2 && side2 == side3){
            System.out.println("it is equilateral triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("It is isoceles triangle");
        }else {
            System.out.println("it is scalene triangle");
        }
    }
}

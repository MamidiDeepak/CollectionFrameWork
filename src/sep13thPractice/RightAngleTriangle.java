package sep13thPractice;

public class RightAngleTriangle {
    public static void main(String[] args) {


//        Right angle triangle
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("__________________");
//        Reverse Right angle Triangle
        for(int i=5; i>=1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

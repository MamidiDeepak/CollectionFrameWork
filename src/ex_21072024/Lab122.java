package ex_21072024;

public class Lab122 {
    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            System.out.println(i);

            if(i==5){
                continue;
//                break;
            }
            System.out.println("outside the loop");

        }
    }
}

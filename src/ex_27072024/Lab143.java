package ex_27072024;

public class Lab143 {
    public static void main(String[] args) {

        int values[]  = {21,23,213,421};

        for(int i=0; i<values.length; i++){
            if(values.length<i){
                System.out.println(values[i]);
            }else {
                System.out.println("outside the loop");
                break;
            }
        }


    }
}

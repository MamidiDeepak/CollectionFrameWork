package ex_20072024;

public class Lab097 {
    public static void main(String[] args) {

        int itemCode = 105;

        switch (itemCode){
            case 100,101,102,103,104 :
                System.out.println("item code is matching");
                break;
            default:
                System.out.println("Item code is not matching");
        }

    }
}

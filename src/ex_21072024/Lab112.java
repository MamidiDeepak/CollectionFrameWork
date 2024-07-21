package ex_21072024;

public class Lab112 {
    public static void main(String[] args) {

//        boolean b1 = true;
//
//        for(int i=0; b1; i++){
//            System.out.println("hlo");

        for (byte b = 0; b <= 2; b++) {
            System.out.println("byte dt");
        }
        for (short s = 0; s <= 2; s++) {
            System.out.println("short dt");
        }

        for (int i = 0; i <= 2; i++) {
            System.out.println("int dt");
        }

        for (long l = 05667L; l <= 2; l++) {
            System.out.println("long dt");
        }

        for (float f = 0.902f; f <= 2; f++) {
            System.out.println("float dt " +f);
        }

        for (double d = 0.902; d <= 2; d++) {
            System.out.println("double dt "+d);
        }

        for (int p = 'a'; p <= 'z'; p++) {
            System.out.println("Alphabets "+p);
        }
    }
}

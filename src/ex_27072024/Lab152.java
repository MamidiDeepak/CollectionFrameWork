package ex_27072024;

public class Lab152 {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Deepak");
//        System.out.println(str.reverse().toString());
        System.out.println(str.length());
        System.out.println(str.indexOf("p"));
        System.out.println(str.deleteCharAt(4));
        System.out.println(str.charAt(0));
        System.out.println(str.replace(2,4, "ak"));

    }
}

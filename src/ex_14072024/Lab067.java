package ex_14072024;

public class Lab067 {
    public static void main(String[] args) {
        String SCP = "Deepak";

        String hp = new String("Deepak");
        String hp1 = new String("Deepak");

        boolean result = (SCP == hp);
        boolean result1 = (SCP.equals(hp));

        System.out.println(result);
        System.out.println(result1);

        String SCP1 = "Deepak";

        System.out.println(SCP == SCP1);
        System.out.println(SCP.equals(SCP1));
        System.out.println(SCP1 == hp);
        System.out.println(SCP1.equals(hp));
        System.out.println(SCP1 == SCP);
        System.out.println(SCP1.equals(SCP));
        System.out.println(hp.equals(hp1));
        System.out.println(hp == hp1);
        System.out.println(SCP == SCP1);
        System.out.println(SCP == hp1);
        System.out.println(SCP.equals(hp1));

        System.out.println(SCP.length());
        System.out.println(SCP.charAt(3));
        System.out.println(SCP.replace('e', 'a'));
        System.out.println(SCP.substring(2));
        System.out.println(SCP.toLowerCase());
        System.out.println(SCP.toUpperCase());




    }
}

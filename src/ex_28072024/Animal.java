package ex_28072024;

public class Animal {
    String name;
    String color;

   void walk(){

    }

    void talk(){

    }

    public static void main(String[] args) {
        Animal r1 = new Animal();
        r1.name = "german";
        System.out.println(r1.name);

        Animal r2 = new Animal();
        r2.name = "chow";
        System.out.println(r2.name);

        Animal r3 = r2;

        System.out.println(r3);
    }
}

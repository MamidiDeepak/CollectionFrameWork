package ex_28072024;

public class DogExecutionClass {

    public static void main(String[] args) {

        Dog r1 = new Dog();
        r1.name = "German";
        r1.age = 2;
        r1.color = "brown";

        Dog r2 = new Dog();
        r2.name = "Chow";
        r2.color = "dark brown";
        r2.age = 3;

        System.out.println(r1.name);
        System.out.println(r1.age);
        System.out.println(r1.color);

        System.out.println();
        System.out.println();

        System.out.println(r2.name);
        System.out.println(r2.age);
        System.out.println(r2.color);




    }
}

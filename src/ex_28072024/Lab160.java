package ex_28072024;

public class Lab160 {
    String name;
    String location;
    int age = 10;

    void work(){}
    void sleeping(){
        System.out.println("employees are sleeping..");
    }

    public static void main(String[] args) {

        Lab160 r1 = new Lab160();
        r1.name = "Deepak";
        r1.age = 100;

        System.out.println(r1.age);

        Lab160 r2 = new Lab160();


        System.out.println(r2.age);
        r2.sleeping();
            }
}

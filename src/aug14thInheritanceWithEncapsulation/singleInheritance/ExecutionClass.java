package aug14thInheritanceWithEncapsulation.singleInheritance;

public class ExecutionClass {

    public static void main(String[] args) {

        Son son = new Son("^&*DHJJk", "67DHJS%^7");
        son.setFatherName("Ajay");
        son.setSonName("Ram");
        son.getFatherName();
        son.getSonName();

        son.setFatherAge(50);
        son.setSonAge(32);
        son.getFatherAge();
        son.getSonAge();
    }
}

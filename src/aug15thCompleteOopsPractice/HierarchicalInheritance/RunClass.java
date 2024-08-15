package aug15thCompleteOopsPractice.HierarchicalInheritance;

public class RunClass {
    public static void main(String[] args) {

        Son son = new Son();
        son.setFatherName("Abhi");
        son.setFatherAge(45);
        System.out.println("______________");
        son.setSonName("Amit");
        son.setSonAge(32);

        System.out.println("________________");

        son.getFatherName();
        son.getFatherAge();
        System.out.println("________________");
        son.getSonName();
        son.getSonAge();
    }
}

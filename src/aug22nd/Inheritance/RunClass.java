package aug22nd.Inheritance;

public class RunClass {
    public static void main(String[] args) {

        Father father = new Father();
        father.setGrandFatherName("Amit");
        father.setGrandFatherAge(65);
        father.setFatherName("Raghu");
        father.setFatherAge(35);
        System.out.println("________");
        father.getGrandFatherName();
        father.getGrandFatherAge();
        father.getFatherName();
        father.getFatherAge();

        System.out.println("_______");
        Son son = new Son();
        son.setGrandFatherName("Ram");
        son.setGrandFatherAge(55);
        son.setSonName("kumar");
        son.setSonAge(45);
        System.out.println("_______");
        son.getGrandFatherName();
        son.getGrandFatherAge();
        son.getSonName();
        son.getSonAge();
    }

}

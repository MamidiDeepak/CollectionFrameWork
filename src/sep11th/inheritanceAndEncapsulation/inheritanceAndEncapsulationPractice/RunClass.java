package sep11th.inheritanceAndEncapsulation.inheritanceAndEncapsulationPractice;

public class RunClass {
    public static void main(String[] args) {
        Son son = new Son("7890DHD98^^&&*", "23234234**&F", "s&^FDDsf78980");

        son.setFatherName("Kanth");
        son.setFatherId(101);
        String fatherName = son.getFatherName();
        System.out.println(fatherName);
        Integer fatherId = son.getFatherId();
        System.out.println(fatherId);
        System.out.println("____________________");

        son.setFatherName("Rajni");
        son.setFatherId(102);
        String fatherName1 = son.getFatherName();
        System.out.println(fatherName1);
        Integer fatherId1 = son.getFatherId();
        System.out.println(fatherId1);

        System.out.println("_________");

        son.setMotherName("A");
        System.out.println(son.getMotherName());
        son.setFatherName("B");
        System.out.println(son.getFatherName());
        son.setSonName("C");
        System.out.println(son.getSonName());

    }

}

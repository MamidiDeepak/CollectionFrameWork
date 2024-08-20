package aug16thCompletePracticeOfOops.polymorphism;

public class RunClass {
    public static void main(String[] args) {

        Mother m = new Mother("Mango");
        m.cooking();
        m.cooking("bendi");
        m.cooking(10);

        Mother d = new Mother(54, 12);
        d.age();
    }
}

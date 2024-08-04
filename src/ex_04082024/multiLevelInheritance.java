package ex_04082024;

public class multiLevelInheritance {

    public static void main(String[] args) {

        GrandParent gp = new GrandParent();
        gp.grandParentMethod();
        System.out.println(gp.grandFather);

        System.out.println();
        FatherParent fp = new FatherParent();
        fp.fatheMethod();
        fp.grandParentMethod();
        System.out.println(fp.fatherParent);
        System.out.println(fp.grandFather);

        System.out.println();
        Child ch = new Child();
        ch.childMethod();
        ch.fatheMethod();
        ch.grandParentMethod();
        System.out.println(ch.child);
        System.out.println(ch.fatherParent);
        System.out.println(ch.grandFather);



}
}
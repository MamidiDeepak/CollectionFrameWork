package ex_04082024.HierarchicalInstance;

public class HierarchicalInstanceRunClass {

    public static void main(String[] args) {

        GrandParent gp = new GrandParent();
        System.out.println(gp.grandParent);
        gp.grandParentMethod();

        System.out.println();
        Father f = new Father();
        System.out.println(f.father);
        System.out.println(f.grandParent);
        f.fatherMethod();
        f.grandParentMethod();

        System.out.println();
        Child c = new Child();
        System.out.println(c.child);
        System.out.println(c.grandParent);
        c.childMethod();
        c.grandParentMethod();



    }

}

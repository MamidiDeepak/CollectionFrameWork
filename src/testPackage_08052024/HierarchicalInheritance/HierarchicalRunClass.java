package testPackage_08052024.HierarchicalInheritance;

public class HierarchicalRunClass {

    public static void main(String[] args) {

        ClassTwo ctwo = new ClassTwo("I am from classtwo", "I am from classone");
        ctwo.classTwoMethod();
        ctwo.classOneMethod();

        System.out.println();
        ClassThree cthree = new ClassThree("I am from classthree", "I am from classone");
        cthree.classThreeMethod();
        cthree.classOneMethod();

        System.out.println();
        ClassFour cfour = new ClassFour("I am from classfour", "I am from classone");
        cfour.classFourMethod();
        cthree.classOneMethod();
    }
}

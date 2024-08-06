package testPackage_08052024.HierarchicalInheritance;

public class ClassTwo extends ClassOne {

    String classtwo;

    ClassTwo(String ctwo, String cone){
        super.classone = cone;
        this.classtwo = ctwo;
    }

    void classTwoMethod(){
        System.out.println("value from classTwo... "+classtwo);
    }
}

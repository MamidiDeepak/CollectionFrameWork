package testPackage_08052024.HierarchicalInheritance;

public class ClassFour extends ClassOne {

    String classfour;

    ClassFour(String fr, String co){
        super.classone = co;
        this.classfour = fr;
    }

    void classFourMethod(){
        System.out.println("value from classfour... "+classfour);
    }
}

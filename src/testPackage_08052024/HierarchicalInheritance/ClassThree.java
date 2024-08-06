package testPackage_08052024.HierarchicalInheritance;

public class ClassThree extends ClassOne {

    String classthree;

    ClassThree(String classthree, String classone){
        super.classone = classone;
        this.classthree = classthree;
    }

    void classThreeMethod(){
        System.out.println("value from classthree... "+classthree);
    }
}

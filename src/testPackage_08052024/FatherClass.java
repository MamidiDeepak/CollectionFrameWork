package testPackage_08052024;

public class FatherClass {

    String fatherName;
    int fatherAge;

    FatherClass(String na, int fa){
        this.fatherName = na;
        this.fatherAge = fa;
    }

    void fatherMethod(){
        System.out.println(fatherName);
        System.out.println(fatherAge);
    }
}

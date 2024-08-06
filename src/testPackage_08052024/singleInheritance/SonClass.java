package testPackage_08052024.singleInheritance;

public class SonClass extends FatherClass {

    String sonName;

    int sonAge;

    SonClass(String sonname, int sonage, String fathername, int fatherage){
        super.fatherName = fathername;
        super.fatherAge = fatherage;
        this.sonName = sonname;
        this.sonAge = sonage;
    }

    void sonMethod(){
        System.out.println(sonName);
        System.out.println(sonAge);
    }
}

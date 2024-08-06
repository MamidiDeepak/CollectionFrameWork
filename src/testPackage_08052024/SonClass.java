package testPackage_08052024;

public class SonClass extends FatherClass {

    String sonName;

    int sonAge;

    SonClass(String sn, int sa, String fn, int fa){
        super(fn,fa);
        this.sonName = sn;
        this.sonAge = sa;
    }

    void sonMethod(){
        System.out.println(sonName);
        System.out.println(sonAge);
    }
}

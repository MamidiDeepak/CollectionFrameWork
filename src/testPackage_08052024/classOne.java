package testPackage_08052024;

public class classOne {

    String carName;
    int modelYear;

    classOne(String cn, int my) {
        this.carName = cn;
        this.modelYear = my;
    }

    void carDetails(){
        System.out.println(carName);
        System.out.println(modelYear);
    }
}

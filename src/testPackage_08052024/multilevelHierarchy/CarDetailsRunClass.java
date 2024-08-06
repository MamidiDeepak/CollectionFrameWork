package testPackage_08052024.multilevelHierarchy;

public class CarDetailsRunClass {
    public static void main(String[] args) {

        CarAcceleration caracc = new CarAcceleration("Automatic", 4,
                                                       "Hand Break", 3,
                                                      "Arctic", "red");
        caracc.carAcceleration();
        System.out.println();
        caracc.carBrakes();
        System.out.println();
        caracc.interiorDesign();
    }

}

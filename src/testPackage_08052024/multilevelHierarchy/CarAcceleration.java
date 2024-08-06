package testPackage_08052024.multilevelHierarchy;

public class CarAcceleration extends CarBrakes {

    String accelerationType;
    int noOfGears;

    CarAcceleration(String accelerationType, int ngears, String bt, int nbreaks, String des, String color ){
        this.accelerationType = accelerationType;
        this.noOfGears = ngears;
        super.BrakeType = bt;
        super.noOfBrakes = nbreaks;
        super.design = des;
        super.interiorDesignColor = color;
    }

    void carAcceleration(){
        System.out.println("Car's Acceleration Type is "+accelerationType);
        System.out.println("Car's no of Gears is "+noOfGears);
    }
}

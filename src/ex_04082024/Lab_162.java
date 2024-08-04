package ex_04082024;

public class Lab_162 {

    String carName;

    int carModelYear;

//    Lab_162 () {
//        System.out.println("constructor is calling by object without params..");
//    }

    Lab_162(String name, int carYear){
        this.carName = name;
        this.carModelYear = carYear;
    }

    void accelerate(){

        System.out.println("Showing " +carName+ " and " +carModelYear+ " year from method..");
    }

    void brakes(){

        System.out.println("Showing " +carName+ " and " +carModelYear+ " year from method who can apply Brakes..");
    }
}

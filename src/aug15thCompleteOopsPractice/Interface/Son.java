package aug15thCompleteOopsPractice.Interface;

public class Son implements Mother, Father {

    void drive(){
        bike();
        loan();
        home();
        Jewellery();
    }

    @Override
    public void bike() {
        System.out.println("I am using my Father Bike");
    }

    @Override
    public void home() {
        System.out.println("I am using my Father home");
    }

    @Override
    public void loan() {
        System.out.println("I am paying my Parents loan");
    }

    @Override
    public void pet() {
        System.out.println("I am looking about my Mother Pet");
    }

    @Override
    public void Jewellery() {
        System.out.println("I am using my Mother Jewellery");
    }
}

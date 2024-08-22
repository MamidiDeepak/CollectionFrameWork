package aug22nd.Inheritance;

public class GrandFather {
    private String grandFatherName;
    private int grandFatherAge;

    public String getGrandFatherName() {
        System.out.println("GrandFather Name is "+grandFatherName);
        return grandFatherName;
    }

    public void setGrandFatherName(String grandFatherName) {
        this.grandFatherName = grandFatherName;
        System.out.println("set the name "+grandFatherName);
    }

    public int getGrandFatherAge() {
        System.out.println("Get GrandFather Age is "+grandFatherAge);
        return grandFatherAge;
    }

    public void setGrandFatherAge(int grandFatherAge) {
        this.grandFatherAge = grandFatherAge;
        System.out.println("Set the age "+grandFatherAge);
    }
}

package aug14thInheritanceWithEncapsulation.singleInheritance;

public class Father {

    private String fatherName;
    private int fatherAge;

    private String fatherDataBase;

    Father(String fatherDbAccess){
        this.fatherDataBase=fatherDbAccess;
        System.out.println("Connected to Father DB successfully with "+fatherDbAccess);
    }

    public String getFatherName() {
        System.out.println(fatherName);
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getFatherAge() {
        System.out.println(fatherAge);
        return fatherAge;
    }

    public void setFatherAge(int fatherAge) {
        this.fatherAge = fatherAge;
    }
}

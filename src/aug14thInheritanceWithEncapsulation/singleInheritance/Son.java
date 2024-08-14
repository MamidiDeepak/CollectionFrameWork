package aug14thInheritanceWithEncapsulation.singleInheritance;

public class Son extends Father {

    private String sonName;
    private int sonAge;

    private String sonDataBase;

    Son(String sonDbAccess, String fatherDbAccess){
        super(fatherDbAccess);
        this.sonDataBase=sonDbAccess;
        System.out.println("Connected to son DB successfully with "+sonDbAccess);
    }

    public String getSonName() {
        System.out.println(sonName);
        return sonName;
    }

    public void setSonName(String sonName) {
        this.sonName = sonName;
    }

    public int getSonAge() {
        System.out.println(sonAge);
        return sonAge;
    }

    public void setSonAge(int sonAge) {
        this.sonAge = sonAge;
    }
}

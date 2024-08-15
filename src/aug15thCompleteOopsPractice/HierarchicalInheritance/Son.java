package aug15thCompleteOopsPractice.HierarchicalInheritance;

public class Son extends Father {

    private String sonName;
    private int sonAge;

    public String getSonName() {
        System.out.println("Son Name is "+sonName);
        return sonName;
    }

    public void setSonName(String sonName) {
        this.sonName = sonName;
        System.out.println("Son Name set as "+sonName);
    }

    public int getSonAge() {
        System.out.println("Son Age is "+sonAge);
        return sonAge;
    }

    public void setSonAge(int sonAge) {
        this.sonAge = sonAge;
        System.out.println("Son Age is "+sonAge);
    }
}

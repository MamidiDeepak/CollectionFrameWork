package sep11th.inheritanceAndEncapsulation.inheritanceAndEncapsulationPractice;

public class Mother extends Father{
    private String motherName;
    private int motherId;
    private String dbToken;

    Mother(String mid,String fid){
        super(fid);
        this.dbToken=mid;
        System.out.println("mother connected to DB with : "+dbToken);
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public int getMotherId() {
        return motherId;
    }

    public void setMotherId(int motherId) {
        this.motherId = motherId;
    }
}

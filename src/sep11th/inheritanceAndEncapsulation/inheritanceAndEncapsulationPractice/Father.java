package sep11th.inheritanceAndEncapsulation.inheritanceAndEncapsulationPractice;

public class Father {

    private String fatherName;
    private int fatherId;
    private String dbToken;

    Father(String fid){
        this.dbToken=fid;
        System.out.println("Father Connected to DB with : "+dbToken);
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getFatherId() {
        return fatherId;
    }

    public void setFatherId(int fatherId) {
        this.fatherId = fatherId;
    }
}

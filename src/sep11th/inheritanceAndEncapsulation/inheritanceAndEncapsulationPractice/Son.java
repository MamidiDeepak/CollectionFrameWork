package sep11th.inheritanceAndEncapsulation.inheritanceAndEncapsulationPractice;

public class Son extends Mother{

    private String sonName;
    private int sonId;
    private String dbToken;

    Son(String id, String mid, String fid) {
        super(mid, fid);
        this.dbToken=id;
        System.out.println("Son Connected to DB with token "+dbToken);
    }

    public String getSonName() {
        return sonName;
    }

    public void setSonName(String sonName) {
        this.sonName = sonName;
    }

    public int getSonId() {
        return sonId;
    }

    public void setSonId(int sonId) {
        this.sonId = sonId;
    }
}

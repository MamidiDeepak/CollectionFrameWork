package sep04th.comparator;

public class student {
    private String name;
    private Integer id;

    public student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public String toString(){
//        return id+ " => "+this.id+ " & "+name+ " this.name";
//    }


    @Override
    public String toString() {
        return "student{" + "name='" + name + '\'' + ", id=" + id + '}';
    }
}

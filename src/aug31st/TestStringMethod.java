package aug31st;

public class TestStringMethod {
    public static void main(String[] args) {


        Person p = new Person(100, "Deepak");
        Person p1 = new Person(101, "Mamidi");

        System.out.println(p);
        System.out.println(p1);
    }
}

class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID is "+id+" & Name is "+name;
    }
}

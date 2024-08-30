package aug30comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareClass {
    public static void main(String[] args) {

        student s1 = new student("deepak",3);
        student s2 = new student("Mamidi",1);
        student s3 = new student("QA",4);
        student s4 = new student("Engineer",2);

        List arrayList = new ArrayList();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        System.out.println(arrayList);
        Collections.sort(arrayList, new SortById());
        Collections.sort(arrayList, new SortByName());
    }
}

class SortByName implements Comparator<student>{

    @Override
    public int compare(student o1, student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortById implements Comparator<student>{

    @Override
    public int compare(student o1, student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}


class student{
    private String name;
    private int id;

    public student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "students{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

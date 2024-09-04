package aug31st;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorPractice<S> {
    public static void main(String[] args) {

        student s1 = new student(2,"Deepak");
        student s2 = new student(4,"Mamidi");
        student s3 = new student(3,"QA");
        student s4 = new student(1,"Engineer");

        ArrayList arrayList = new ArrayList();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
//        System.out.println(arrayList);
//        Collections.sort(arrayList, new SortByID());
        Collections.sort(arrayList, new SortByName());
//        Collections.sort(arrayList, new SortByNameDesc());
//        Collections.sort(arrayList, new SortByIDDesc());
        System.out.println(arrayList);

    }
}

class SortByName implements Comparator<student>{


    @Override
    public int compare(student o1, student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByNameDesc implements Comparator<student>{

    @Override
    public int compare(student o1, student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

class SortByID implements Comparator<student>{
    @Override
    public int compare(student o1, student o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}

class SortByIDDesc implements Comparator<student>{
    @Override
    public int compare(student o1, student o2) {
        return Integer.compare(o2.getId(),o1.getId());
    }
}

class student{

    private int id;
    private String name;

    public student(int id,String name) {
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
        return "student{" +"id=" + id +", name='" + name + '\'' +'}';
    }
}
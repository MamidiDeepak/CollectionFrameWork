package sep04th.comparator;

import java.util.*;

public class RunClass {
    public static void main(String[] args) {

        student s1 = new student("Deepak",4);
        student s2 = new student("Mamidi",1);
        student s3 = new student("Qa",2);
        student s4 = new student("Engineer",3);


//        HashMap<String,Integer> hm = new HashMap<>();
        ArrayList al = new ArrayList();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
//        System.out.println(al);
//        Collections.sort(al,new SortById());
//        Collections.sort(al,new SortByCharacter());
//        Collections.sort(al,new SortByIdDesc());
        Collections.sort(al,new SortByCharacterDesc());
        System.out.println(al);
    }
}

class SortById implements Comparator<student> {
    @Override
    public int compare(student o1, student o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}

class SortByIdDesc implements Comparator<student> {
    @Override
    public int compare(student o1, student o2) {
        return Integer.compare(o2.getId(),o1.getId());
    }
}

class SortByCharacter implements Comparator<student> {
    @Override
    public int compare(student o1, student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByCharacterDesc implements Comparator<student> {
    @Override
    public int compare(student o1, student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

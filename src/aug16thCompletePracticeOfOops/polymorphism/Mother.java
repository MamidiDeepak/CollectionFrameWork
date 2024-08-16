package aug16thCompletePracticeOfOops.polymorphism;

public class Mother {

    String a;

    int age;
    int roll;

    Mother(String a){
        this.a=a;
    }

    Mother(int age, int roll){
        this.age=age;
        this.roll=roll;
    }

    void cooking(){
        System.out.println("I will cook "+a+" today");
    }

    void cooking(String b){
        System.out.println("I will cook "+a+" and "+b);
    }

    void cooking(int quantity){
        System.out.println("I will cook "+a+" of "+quantity+" kgs");
    }

//    void age(){
//        System.out.println("Age is "+age);
//    }

    void age(){
        System.out.println("Age is "+age+" and "+roll);
    }


}

package polymorphism.methodOverLoading;

public class ClassOne {

   private int a;
   private int b;

   private String ab = " ";
   private String ba = " ";

    ClassOne(){
        System.out.println("Default Constructor");
    }

    ClassOne(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("Constructor with int params "+a+" and "+b);
    }

    ClassOne(String a, String b){
        this.ab=a;
        this.ba=b;
        System.out.println("Constructor with String params "+ab+" and "+ba);
    }

    void add(){
        System.out.println("method without Params");
    }

    void add(int a, int b){
        System.out.println("method with a = "+a+" value and b = "+b+" value");
    }


}

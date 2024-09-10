package sep10th;

public class Student extends Thread{
    @Override
    public void run(){
        System.out.println("Running from student class");
    }
}

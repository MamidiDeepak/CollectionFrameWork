package sep10MultiThreading;

public class TestMultiThreading {
    public static void main(String[] args) throws Exception {

//        Type-1
//        Students student = new Students();
//        student.start();
//
//        Faculty faculty = new Faculty();
//        System.out.println("____________");
//        faculty.start();

//        Type-2
//        Students studentR = new Students();
//        Thread studentThread = new Thread(studentR);
//        studentThread.start();
//
//        Faculty facultyR = new Faculty();
//        Thread facultyThread = new Thread(facultyR);
//        facultyThread.start();

//        Type-3
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("I am running from anonymous class");
//            }
//        };
//
//        Thread t1 = new Thread(runnable);
//        t1.start();

//        Type-4
        Runnable runnable1 = () -> {
            for(int i=0;i<5;i++) {
                System.out.println("Running from lambda-1 class");
            }
        };

        Thread t2 = new Thread(runnable1);


//        Type-5
        Runnable runnable2 = () -> {
            for (int i=0;i<5;i++) {
                System.out.println("Running from lambda-2 class");
            }
        };

        Thread t3 = new Thread(runnable2);
        System.out.println(t3.getState());

        t2.start();
        System.out.println(t2.getState());
//        t2.join();
        Thread.sleep(10000);
        t3.start();
        System.out.println(t2.getState());
    }
}

//Type-1
//class Students extends Thread{
//    @Override
//    public void run(){
//        System.out.println("Running from Thread student class");
//    }
//}
//
//class Faculty extends Thread{
//    @Override
//    public void run(){
//        System.out.println("Running from Thread Faculty class");
//    }
//}

//Type-2
//class Students implements Runnable{
//    @Override
//    public void run() {
//        System.out.println("Running from Runnable student class");
//    }
//}
//
//class Faculty implements Runnable{
//    @Override
//    public void run() {
//        System.out.println("Running from Runnable Faculty class");
//    }
//}


//6 point of multiThreading (Thread Life Cycle)
//New (when Thread gets created)
//Runnable (When Thread Starts)
//Blocked (When Thread started and blocked for some time (to complete))
//Waiting (using join (It will stop next thread to start execution))
//Timed Waiting (Thread.sleep(2000) Based on the mentioned time it will sleep)
//Terminated (When Thread completed its life cycle)



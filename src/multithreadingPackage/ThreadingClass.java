package multithreadingPackage;

public class ThreadingClass {
    public static void main(String[] args) {

//        System.out.println("Hlo java developers");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(Thread.currentThread().getId());
//        System.out.println(Thread.activeCount());

        Employee1 e = new Employee1("T1");
        e.start();

        managers1 m = new managers1("T2");
        m.start();

        Employee2 e2 = new Employee2();
        Thread t = new Thread(e2,"f1");
        t.start();

        managers2 m2 = new managers2();
        Thread t1 = new Thread(m2,"f2");
        t1.start();
    }
}

class Employee1 extends Thread{

    public Employee1(String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.println("Hlo "+Thread.currentThread().getName()+ " >> "+Thread.currentThread().getId());
    }
}

class managers1 extends Thread{

    public managers1(String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.println("Hi "+Thread.currentThread().getName()+ " >> "+Thread.currentThread().getId());
    }
}

class Employee2 extends Thread implements Runnable{

    @Override
    public void run() {
        System.out.println("Emp2 "+Thread.currentThread().getName()+" >> "+Thread.currentThread().getId());
    }
}

class managers2 implements Runnable{

    @Override
    public void run() {
        System.out.println("man2 "+Thread.currentThread().getName()+" >> "+Thread.currentThread().getId());
    }
}

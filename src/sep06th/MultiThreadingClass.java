package sep06th;

import aug27th.interfacePackage.S;

public class MultiThreadingClass {
    public static void main(String[] args) {

        Employees e = new Employees("");
        Thread e1 = new Thread(e,"Deepak");
        e1.start();

        Students s = new Students("");
        Thread s1 = new Thread(s,"Raj");
        s1.start();
    }
}

class Employees extends Thread implements Runnable{

    Employees(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("empClass "+Thread.currentThread().getName()+ " >> "+Thread.currentThread().getId());
    }
}

class Students extends Thread implements Runnable{

    Students(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("stuClass "+Thread.currentThread().getName()+ " >> "+Thread.currentThread().getId());
    }
}
package com.multithreading;

public class ThreadingClass {
    public static void main(String[] args) {

//        System.out.println("Hlo java developers");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(Thread.currentThread().getId());
//        System.out.println(Thread.activeCount());

        Employee e = new Employee();
        e.start();

        managers m = new managers();
        m.start();
    }
}

class Employee extends Thread{

    @Override
    public void run(){
        System.out.println("Hlo, run method from thread class");
    }
}

class managers extends Thread{

    @Override
    public void run(){
        System.out.println("Hlo, run method from manager thread class");
    }
}

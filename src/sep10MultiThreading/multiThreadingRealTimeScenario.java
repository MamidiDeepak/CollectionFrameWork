package sep10MultiThreading;

public class multiThreadingRealTimeScenario {
    public static void main(String[] args) throws InterruptedException {

        BrickCounting bd = new BrickCounting();

        Runnable r1 = () -> {
          for(int i=0; i<5000;i+=50){
                bd.calculateBrickCount();
            }
        };

        Runnable r2 = () -> {
            for(int i=0; i<15000;i+=50){
                bd.calculateBrickCount();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(bd.brickCount);
        System.out.println(bd.brickCount2);

    }
}

class BrickCounting{

    int brickCount = 0;
    int brickCount2 = 0;

    public void calculateBrickCount(){
        synchronized (this){
            brickCount += 50;
        }

        brickCount2 += 50;

    }
}


package sep10th;

public class MultiThreading {

    public static void main(String[] args) throws InterruptedException {

     Student s = new Student();
     s.start();

        System.out.println("________");

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am from anonymous class");
            }
        };

//        Runnable rr = () -> {
//            for(int i=0;i<=5;i++) {
//                System.out.println("I am from lambda-1 class");
//            }
//        };

//        Runnable rrf = () -> {
//            for(int i=0;i<=5;i++) {
//                System.out.println("I am from lambda-2 class");
//            }
//        };

//        Thread ree = new Thread(rrf);


        Thread re = new Thread(r);
        re.start();

//        Thread r1 = new Thread(rr);
//        r1.start();
//        r1.join();
//        ree.start();

    }

}


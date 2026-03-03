package Multithreading;

public class ThreadClassExample {
    public static void main(String[] args) {
        Thread one = new Thread1();
        Thread two = new Thread2();
        Thread three = new Thread(() -> {
            for(int i = 0; i < 5; i++)
                System.out.println("Thread3: "+ i);
        });

        System.out.println("Before starting any threads");

        one.start();
        System.out.println("After starting thread one.");

        two.start();
        System.out.println("After starting thread two.");

        three.start();
        //three.join();

        System.out.println("End of the program");
    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Thread1: " + i);
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Thread2: " + i);
        }
    }
}

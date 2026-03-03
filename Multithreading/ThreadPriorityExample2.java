package Multithreading;

public class ThreadPriorityExample2 {
    public static void main(String[] args) {
        Thread one = new Thread(()->{
            System.out.println(Thread.currentThread().getName() + " says Hi!");
        });
        one.setPriority(Thread.MAX_PRIORITY);

        one.start();

        System.out.println("Hello World!");
    }
}

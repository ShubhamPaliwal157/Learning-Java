package Multithreading;

public class DaemonExample {
    public static void main(String[] args) {
        Thread bgThread = new Thread(new DaemonHelper());
        Thread usrThread = new Thread(new UserHelper());
        bgThread.setDaemon(true);
        
        bgThread.start();
        usrThread.start();
    }
}

class DaemonHelper implements Runnable {
    @Override
    public void run() {
        int count = 0;
        while(count < 500) {
            try {
                Thread.sleep(1000);  //Throws and Interrupted Exception.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            System.out.println("Daemon Helper Running...");
        }
    }
}

class UserHelper implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);  //Throws and Interrupted Exception.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("User Thread Finished Executing.");
    }
}

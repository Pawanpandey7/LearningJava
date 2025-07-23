class MyThread extends Thread {
    private String threadName;

    MyThread(String name) {
        threadName = name;
    }

    // The run() method defines what the thread will do
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                // Sleep to simulate work and allow thread switching
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
        System.out.println(threadName + " has finished.");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        // Creating three threads
        MyThread t1 = new MyThread("Thread-One");
        MyThread t2 = new MyThread("Thread-Two");
        MyThread t3 = new MyThread("Thread-Three");

        // Starting the threads
        t1.start();
        t2.start();
        t3.start();
    }
}

//1. Performing single task from single thread

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread Task 1");
    }
}

public class ThreadCase1 {

    public static void main(String[] args) // This is main thread created by JVM
    {

        MyThread myThread1 = new MyThread(); // Creating Thread
        myThread1.start();
    }
}

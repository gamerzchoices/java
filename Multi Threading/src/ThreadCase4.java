//4. Performing multiple Task using multiple Threads

//Creating Multiple task
class MyThread1 extends Thread {
    public void run() {
        System.out.println("Video is playing");
    }
}

class MyThread2 extends Thread {
    public void run() {
        System.out.println("Music is playing");
    }
}

class MyThread3 extends Thread {
    public void run() {
        System.out.println("Timer is running");
    }
}

public class ThreadCase4 {

    public static void main(String[] args) {
        // Creating multiple Thread

        MyThread1 thread1 = new MyThread1();
        thread1.start();

        MyThread2 thread2 = new MyThread2();
        thread2.start();

        MyThread3 thread3 = new MyThread3();
        thread3.start();
    }

}

// Number of threads = 4 (including main thread)
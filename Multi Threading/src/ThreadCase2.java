//2. Performing single Task from multiple threads 

class MyThread extends Thread {
    public void run() {
        System.out.println("Task 1 executing");
    }
}

public class ThreadCase2 {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();

        MyThread thread2 = new MyThread();
        thread2.start();

        MyThread thread3 = new MyThread();
        thread3.start();
    }

}

// In multiple threads, all threads excutes at same time. We can't judge which
// thread executes first and completes even if thread1 is written in first of
// thread2 and thread3.
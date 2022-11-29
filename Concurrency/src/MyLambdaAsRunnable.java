public class MyLambdaAsRunnable {
    public static void main(String[] args) {

        // Thread-0
        Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        t1.start();

        // Thread-1
        Thread t2 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        t2.start();

        // t.run() is ordinary method. Thread is not created

        System.out.println(Thread.currentThread().getName());
    }
}

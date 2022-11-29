public class MyRunnable implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();

        System.out.println(Thread.currentThread().getName());

    }
}

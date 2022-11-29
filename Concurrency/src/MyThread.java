public class MyThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new MyThread().start();

        System.out.println(Thread.currentThread().getName());
    }

}

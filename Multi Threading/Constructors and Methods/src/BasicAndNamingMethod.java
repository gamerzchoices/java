class ThreadWork extends Thread {
    public void run() {

        // First way to Name Thread
        // Thread.currentThread().setName("Rock");
        System.out.println("Thread Task : " + Thread.currentThread().getName());

    }
}

public class BasicAndNamingMethod {
    public static void main(String[] args) {
        // This is main thread created by JVM with name "main" . Other threads that will
        // be started in main method is executed by main Thread by JVM

        System.out.println("Hello World!");

        // currentThread() --> it is static method so we directly use it with Thread, it
        // provide reference of current running Thread

        // getName() --> returns thread name
        System.out.println(Thread.currentThread().getName());

        // setName() --> we can assign Thread name
        Thread.currentThread().setName("Prabesh");
        System.out.println(Thread.currentThread().getName());

        // Exception print
        // System.out.println(10 / 0);

        ThreadWork tw1 = new ThreadWork();
        tw1.start(); // Name is auto assigned by JVM

        ThreadWork tw2 = new ThreadWork();
        tw2.setName("John Cena"); // Second way of Naming Thread
        tw2.start();

        ThreadWork tw3 = new ThreadWork();
        tw1.setName("Rock");
        tw3.start();

        // isAlive() --> returns true if alive
        System.out.println(tw2.isAlive());

    }
}

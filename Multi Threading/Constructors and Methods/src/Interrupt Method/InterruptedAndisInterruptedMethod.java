class Demo1 extends Thread {
    public void run() {

        System.out.println(Thread.interrupted()); // when we use interrupted method once it sets interrupt status from
                                                  // true to false. And when we use it second time, false is always
                                                  // false

        try {

            for (int i = 0; i <= 6; i++) {
                System.out.println(i);
                Thread.sleep(1000);
                System.out.println("Interrupt status : " + Thread.interrupted());
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

}

class Demo2 extends Thread {
    public void run() {

        System.out.println(Thread.currentThread().isInterrupted()); // only shows status

        try {

            for (int i = 0; i <= 6; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

}

public class InterruptedMethod {

    public static void main(String[] args) throws InterruptedException {
        Demo1 d1 = new Demo1();
        d1.start();
        d1.interrupt();

        d1.join();

        Demo2 d2 = new Demo2();
        d2.start();
        d2.interrupt();
    }
}
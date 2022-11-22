class TotalRevenue extends Thread {

    int total = 0;

    public void run() {

        // Works with sunchronized block
        synchronized (this) {
            for (int i = 1; i <= 100; i++) {
                total = total + 100000;
            }
            this.notify(); // release the lock after completing the task and invoke main thread
            // this.notifyAll(); release the lock after completing the task and invokes all
            // other threads
        }
    }
}

public class InterThreadCommunicationMethods {
    public static void main(String[] args) throws InterruptedException {

        TotalRevenue tr = new TotalRevenue();
        tr.start();

        // System.out.println("Total revenue : " + tr.total);

        synchronized (tr) {

            // main thread releases the lock and wait for thread-0 to notify that task has
            // been completed

            tr.wait();

        }

        System.out.println("Total revenue : " + tr.total);
    }
}

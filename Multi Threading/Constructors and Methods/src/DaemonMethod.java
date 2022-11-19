public class DaemonMethod extends Thread {

    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread");
        } else {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main Thread");

        DaemonMethod dM = new DaemonMethod();
        dM.setDaemon(true);
        dM.start();
    }
}

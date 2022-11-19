public class JoinMethodInMainThread extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 6; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinMethodInMainThread jm = new JoinMethodInMainThread();

        jm.start();

        jm.join(); // Main method is waiting for jm thread to complete the task

        try {
            for (int i = 0; i <= 6; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}

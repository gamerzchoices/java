public class JoinMethodInThread extends Thread {

    static Thread mT;

    public void run() {
        try {
            mT.join();
            for (int i = 6; i >= 1; i--) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public static void main(String[] args) {

        mT = Thread.currentThread();
        JoinMethodInThread jm = new JoinMethodInThread();
        jm.start();

        try {

            for (int i = 6; i >= 1; i--) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

}

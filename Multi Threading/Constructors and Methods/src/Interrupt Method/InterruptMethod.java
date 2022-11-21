public class InterruptMethod extends Thread {
    public void run() {
        try {

            for (int i = 1; i <= 6; i++) {
                System.out.println("Thead task " + i);
                Thread.sleep(1000);
            }

        } catch (Exception es) {
            System.out.println(es.toString());
        }
    }

    public static void main(String[] args) {
        InterruptMethod im = new InterruptMethod();
        im.start();
        im.interrupt();
    }

}

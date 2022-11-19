public class PreventThreadExecutionYieldMethod extends Thread {

    public void run() {
        Thread.yield();
        for (int i = 0; i <= 6; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        PreventThreadExecutionYieldMethod pT = new PreventThreadExecutionYieldMethod();

        pT.start();

        // Thread.yield(); --> if I want to stop main thread and provide chance to other
        // Thread

        for (int i = 0; i <= 6; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

    }
}

public class PriorityMethod extends Thread {

    public void run() {
        System.out.println("Child Thread priority : " + Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {

        System.out.println("Main Thread old priority : " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(MAX_PRIORITY);
        System.out.println("Main Thread new priority : " + Thread.currentThread().getPriority());

        PriorityMethod pM = new PriorityMethod();
        pM.setPriority(4);

        pM.start();
    }
}

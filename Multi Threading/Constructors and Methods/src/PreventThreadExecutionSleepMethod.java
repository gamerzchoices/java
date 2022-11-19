// Always have to use try catch or throws Exception in method to handle Exception

//Static method can be directly called using class

class Test extends Thread {
    public void run() {
        try {
            for (int i = 10; i >= 0; i--) {
                Thread.sleep(1000); // 1000 milli = 1 sec
                System.out.println("Child Thread " + i);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}

public class PreventThreadExecutionSleepMethod {

    public static void main(String[] args) throws Exception {

        for (int i = 10; i >= 0; i--) {
            Thread.sleep(1000); // 1000 milli = 1 sec
            System.out.println("Main thread " + i);
        }

        Test t = new Test();
        t.setPriority(10);
        t.start();

    }
}


//1. Extends the Thread class
public class ThreadIntro extends Thread {

    // 2. Override the run method
    public void run() {

        // We provide Task in this method
        System.out.println("Thread task 1");
    }

    public static void main(String[] args) {
        // 3. Create object of class
        ThreadIntro t = new ThreadIntro();

        // 4. Start the thread
        t.start(); // run method is called internally
        t.run(); // It is simple method only not thread

        t.start(); // Once the thread is dead, it doesn't become alive again
    }

}

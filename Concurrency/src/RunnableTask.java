import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableTask {

    public static void main(String[] args) {

        // Create a ExecutorService with single thread pool using one thread

        ExecutorService es = Executors.newSingleThreadExecutor();

        // Execute the runnable task asynchronously - void run()

        es.execute(() -> System.out.println("Hello World!"));

        // shutdown the ExecutorService otherwise it will never terminate

        es.shutdown();
    }

}

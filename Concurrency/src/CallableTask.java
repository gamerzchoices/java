import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableTask {
    public static void main(String[] args) {

        // Create a ExecutorService with single thread pool using one thread

        ExecutorService es = Executors.newSingleThreadExecutor();

        // Submit a callable task (asynchronously) to the executor service

        Future<Integer> future = es.submit(() -> (4 > 5) ? 4 : 5);

        try {
            // get() will block/wait for 500ms max
            // TimeUnit is enum

            System.out.println("Greater is " + future.get(500, TimeUnit.MILLISECONDS));
        } catch (Exception e) {
            e.printStackTrace();

            es.shutdown();

        }
    }
}

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TypesOfExecutorService {
    public static void main(String[] args) {

        // Single thread pool ExecutorService
        ExecutorService es1 = Executors.newSingleThreadExecutor();

        // Cached thread pool
        ExecutorService es2 = Executors.newCachedThreadPool();

        // Fixed thread pool
        ExecutorService es3 = Executors.newFixedThreadPool(1);
    }
}

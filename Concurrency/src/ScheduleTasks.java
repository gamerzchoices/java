import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* Task Schedule 

Executers enable us to schedule a task to perform at some time in the future 

Additionally, we can schedule a task to occur repeatedly at particular interval

We can create Scheduled Executors using executors utility class

ScheduledExecutorService    newSingleThreadScheduledExecutor()
ScheduledExecutorService    newScheduledThreadPool()


 */

public class ScheduleTasks {

    private static ScheduledExecutorService sES = Executors.newScheduledThreadPool(10);

    public static void main(String[] args) {

        // scheduleTask();

        scheduleTaskWithFixedDelay();

        // scheduleTaskAtFixedRate();
    }

    // Methods

    public static void scheduleTask() {
        System.out.println("Start");

        // schedule Method
        Future<Integer> future = sES.schedule(() -> 1, 2, TimeUnit.SECONDS);
        try {

            System.out.println(future.get());

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            sES.shutdown();
        }
        System.out.println("The end");

    }

    public static void scheduleTaskWithFixedDelay() {
        System.out.println("Start");

        final long initialDelay = 1000, timeToWaitAfterPreviousTaskCompleted = 500;

        // scheduleWithFixedDelay
        sES.scheduleWithFixedDelay(() -> System.out.println(Thread.currentThread().getName()), initialDelay,
                timeToWaitAfterPreviousTaskCompleted, TimeUnit.MILLISECONDS);
        sES.shutdown(); // Nothing happens if shutdown

    }

    public static void scheduleTaskAtFixedRate() {

        System.out.println("Start");

        final long initialDelay = 2000, timeToWaitAfterPreviousTaskCompleted = 300;

        sES.scheduleAtFixedRate(() -> System.out.println("Thread id: " + Thread.currentThread().getId()), initialDelay,
                timeToWaitAfterPreviousTaskCompleted, TimeUnit.MILLISECONDS);

        sES.shutdown();
    }
}

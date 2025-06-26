package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Counter sharedCounter = new Counter();

        // -------- Thread pool executor --------
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(new Worker(sharedCounter, "Thread-1"));
        executor.execute(new Worker(sharedCounter, "Thread-2"));
        executor.execute(new Worker(sharedCounter, "Thread-3"));

        executor.shutdown();
        while (!executor.isTerminated()) {
            // wait for all threads to finish
        }

        System.out.println("Final Shared Count: " + sharedCounter.getCount());

        // -------- Volatile variable demo --------
        VolatileExample demo = new VolatileExample();
        demo.runDemo();
    }
}

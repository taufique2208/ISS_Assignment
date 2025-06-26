package multithreading;

public class VolatileExample {
    private volatile boolean running = true;

    public void runDemo() {
        Thread t = new Thread(() -> {
            while (running) {
                // loop until flag becomes false
            }
            System.out.println("Thread stopped.");
        });

        t.start();

        try {
            Thread.sleep(1000); // Let the thread run
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        running = false; // Volatile ensures this change is visible
        System.out.println("Main set running to false.");
    }
}

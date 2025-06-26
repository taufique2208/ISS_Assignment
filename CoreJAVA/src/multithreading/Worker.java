package multithreading;

public class Worker implements Runnable {
    private Counter counter;
    private String name;

    public Worker(Counter counter, String name) {
        this.counter = counter;
        this.name = name;
    }

    @Override
    public void run() {
        // Local variable – thread-safe
        int local = 0;

        for (int i = 0; i < 1000; i++) {
            local++;                // thread-safe (local)
            counter.increment();    // instance-level thread-safe (synchronized)
        }

        System.out.println(name + " finished. Local count: " + local);
    }
}

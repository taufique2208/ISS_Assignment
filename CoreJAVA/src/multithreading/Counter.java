package multithreading;

public class Counter {
    private int count = 0;

    // synchronized method
    public synchronized void increment() {
        count++;
    }

    // block-level synchronization
    public void blockIncrement() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

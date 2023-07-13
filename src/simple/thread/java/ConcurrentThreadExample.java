package simple.thread.java;

public class ConcurrentThreadExample {
    public static void main(String[] args) {
        ThreadUsingThreadClass t0 = new ThreadUsingThreadClass();
        ThreadImplementsRunnable thread = new ThreadImplementsRunnable();
        Thread t1 = new Thread(thread);

        t0.start();
        t1.start();

    }
}

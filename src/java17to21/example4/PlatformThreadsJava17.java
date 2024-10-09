package java17to21.example4;

// *** Concurrency with Platform Threads (Java 17) vs Virtual Threads (Java 21) ***
// In Java 17, concurrency is managed using platform threads, which have more overhead. Java 21 introduces virtual threads (Project Loom), which are lightweight and more scalable.
public class PlatformThreadsJava17 {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            System.out.println("Running task in platform thread: " + Thread.currentThread());
        };

        Thread thread = new Thread(task);  // Creates a platform thread
        thread.start();
        thread.join();
    }
}

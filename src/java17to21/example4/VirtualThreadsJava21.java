package java17to21.example4;

// *** Concurrency with Platform Threads (Java 17) vs Virtual Threads (Java 21) ***
// In Java 21, virtual threads offer a lightweight alternative to platform threads, making it easier to handle large numbers of concurrent tasks efficiently.
public class VirtualThreadsJava21 {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            System.out.println(STR."Running task in virtual thread: \{Thread.currentThread()}");
        };

        Thread.startVirtualThread(task);  // Creates a virtual thread
    }
}
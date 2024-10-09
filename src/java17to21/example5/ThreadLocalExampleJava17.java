package java17to21.example5;

// *** ThreadLocal (Java 17) vs Scoped Values (Java 21) ***
// In Java 17, developers often use ThreadLocal to manage per-thread state.
// Java 21 introduces Scoped Values as a safer and more efficient alternative, especially with virtual threads.
public class ThreadLocalExampleJava17 {
    private static final ThreadLocal<String> currentUser = ThreadLocal.withInitial(() -> "Unknown");

    public static void main(String[] args) {
        currentUser.set("Alice");
        System.out.println(STR."Current user: \{currentUser.get()}");  // Output: Current user: Alice
    }
}
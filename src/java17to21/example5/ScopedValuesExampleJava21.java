package java17to21.example5;

// *** ThreadLocal (Java 17) vs Scoped Values (Java 21) ***
// Scoped Values in Java 21 provide a safer alternative to ThreadLocal and are particularly useful for managing state with virtual threads.
public class ScopedValuesExampleJava21 {
    static final ScopedValue<String> CURRENT_USER = ScopedValue.newInstance();

    public static void main(String[] args) throws InterruptedException {
        ScopedValue.where(CURRENT_USER, "Alice").run(() -> {
            System.out.println("Current user: " + CURRENT_USER.get());  // Output: Current user: Alice
        });
    }
}
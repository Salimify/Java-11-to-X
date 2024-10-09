package java17to21.example1;

// *** Pattern Matching for switch (Java 17 vs Java 21) ***
public class PatternMatchingInstanceofJava17 {
    public static void main(String[] args) {
        Object obj = "Hello, Java 17";

        if (obj instanceof String str) {
            System.out.println("String length: " + str.length());
        } else if (obj instanceof Integer i) {
            System.out.println("Integer value: " + i);
        }
    }
}
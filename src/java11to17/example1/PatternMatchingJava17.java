package java11to17.example1;

// *** Pattern Matching for instanceof ***
public class PatternMatchingJava17 extends PatternMatchingJava11 {
    public static void main(String[] args) {
        Object obj = 1;

        if (obj instanceof String str) {  // No need for manual casting
            System.out.println(str.toUpperCase());  // JAVA 17
        }
    }
}
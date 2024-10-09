package java11to17.example1;

// *** Pattern Matching for instanceof ***
public class PatternMatchingJava11 {
    public static void main(String[] args) {
        Object obj = "Java 11";

        if (obj instanceof String) {
            String str = (String) obj;  // Manual casting here
            System.out.println(str.toUpperCase());  // JAVA 11
        }
    }
}

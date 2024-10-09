package java17to21.example1;

// *** Pattern Matching for switch (Java 17 vs Java 21) ***
// Java 17 supports pattern matching for instanceof, but Java 21 takes this further by allowing pattern matching directly in switch statements
public class PatternMatchingSwitchJava21 {
    public static void main(String[] args) {
        Object obj = "Hello, Java 21";

        String result = switch (obj) {
            case String str -> "String length: " + str.length();  // Direct pattern matching in switch
            case Integer i -> "Integer value: " + i;
            default -> "Unknown type";
        };
    }
}

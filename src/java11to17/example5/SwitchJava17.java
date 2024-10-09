package java11to17.example5;

// *** Switch Expressions (Java 17) ***
// arrow notation for more concise code, and the break keyword is no longer needed
public class SwitchJava17 {
    public static void main(String[] args) {
        String day = "MONDAY";
        int numLetters = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY" -> 7;
            default -> 0;
        };
        System.out.println("Number of letters: " + numLetters);
    }
}
package java11to17.example5;

// *** Switch Expressions (Java 17) ***
public class SwitchJava11 {
    public static void main(String[] args) {
        String day = "MONDAY";
        int numLetters;

        switch (day) {
            case "MONDAY":
            case "FRIDAY":
            case "SUNDAY":
                numLetters = 6;
                break;
            case "TUESDAY":
                numLetters = 7;
                break;
            default:
                numLetters = 0;
        }
        System.out.println("Number of letters: " + numLetters);
    }
}
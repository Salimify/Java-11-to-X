package java11to17.example3;

// *** Text Blocks ***
// Java 13, Standardized in Java 15
public class TextBlockJava17 {
    public static void main(String[] args) {
        String json = """
                      {
                        "name": "Alice",
                        "age": 30
                      }
                      """;
        System.out.println(json);
    }
}
package java17to21.example3;

// *** Text Blocks (Java 17) vs String Templates (Java 21) ***
public class TextBlocksJava17 {
    public static void main(String[] args) {
        String json = """
                      {
                        "name": "Alice",
                        "age": 30
                      }
                      """;
        System.out.println(json);  // Multi-line string output
    }
}
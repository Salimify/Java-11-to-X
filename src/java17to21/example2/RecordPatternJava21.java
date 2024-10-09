package java17to21.example2;

// *** Records (Java 17) vs Record Patterns (Java 21) ***
// In Java 21, record patterns allow you to destructure records directly in patterns.
public class RecordPatternJava21 {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        if (person instanceof Person(String name, int age)) {
            System.out.println("Name: " + name + ", Age: " + age);
            // Output: Name: Alice, Age: 30
        }
    }
}
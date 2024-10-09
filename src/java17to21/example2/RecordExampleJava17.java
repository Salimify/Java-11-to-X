package java17to21.example2;

// *** Records (Java 17) vs Record Patterns (Java 21) ***
public class RecordExampleJava17 {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println("Name: " + person.name() + ", Age: " + person.age());
        // Output: Name: Alice, Age: 30
    }
}
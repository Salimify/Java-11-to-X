package java11to17.example2;

// *** Records ***
public class RecordExample {
    public static void main(String[] args) {
        PersonJava17 person = new PersonJava17("Alice", 30);
        System.out.println(person.name());
        System.out.println(person.age());
        System.out.println(person);         // Prints: PersonJava17[name=Alice, age=30]
    }
}

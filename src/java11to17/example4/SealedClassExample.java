package java11to17.example4;

// *** Sealed Classes ***
public class SealedClassExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        System.out.println("Vehicle is a: " + vehicle.getClass().getSimpleName());  // Car
    }
}

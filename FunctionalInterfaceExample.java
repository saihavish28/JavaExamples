@FunctionalInterface
interface MyFunctionalInterface {
    void sayHello();  // Only one abstract method
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using Lambda Expression
        MyFunctionalInterface greeting = () -> System.out.println("Hello, Functional Interface!");
        greeting.sayHello();  // Output: Hello, Functional Interface!
    }
}

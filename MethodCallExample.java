public class MethodCallExample {

    // Static method
    public static void greet() {
        System.out.println("Hello from the static method!");
    }

    // Instance method
    public void callGreet() {
        // Calling static method from instance method
        greet(); // You can also use MethodCallExample.greet();
    }

    public static void main(String[] args) {
        MethodCallExample obj = new MethodCallExample();
        obj.callGreet(); // This triggers the instance method, which calls the static method
    }
}
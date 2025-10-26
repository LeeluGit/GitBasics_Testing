public class MethodCallExample {

    // Static method
    public static void displayMessage() {
        System.out.println("Hello from the static method!");
    }

    // Instance method
    public void callStaticMethod() {
        // Calling static method from instance method
        displayMessage(); // You can also use MethodCallExample.displayMessage();
    }

    public static void main(String[] args) {
        // Create an object to call the instance method
        MethodCallExample example = new MethodCallExample();
        example.callStaticMethod(); // This will internally call the static method
    }
}
public class VariableDemo {

    // Static variable
    static String staticMessage = "I am a static variable";

    // Instance variable
    String instanceMessage = "I am an instance variable";

    // Instance method to demonstrate all three types
    public void showVariables() {
        // Local variable
        String localMessage = "I am a local variable";

        // Accessing all three variables
        System.out.println(localMessage);         // Local variable
        System.out.println(instanceMessage);      // Instance variable
        System.out.println(staticMessage);        // Static variable
    }

    public static void main(String[] args) {
        // Create an object to call the instance method
        VariableDemo demo = new VariableDemo();
        demo.showVariables();
    }
}
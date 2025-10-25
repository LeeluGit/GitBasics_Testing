public class VariableDemo {

    // Static variable
    static String schoolName = "Greenwood High";

    // Instance variable
    int studentId = 101;

    // Instance method to demonstrate variable access
    public void showDetails() {
        // Local variable
        String studentName = "Santhosh";

        // Accessing all three types of variables
        System.out.println("Student Name (Local): " + studentName);
        System.out.println("Student ID (Instance): " + studentId);
        System.out.println("School Name (Static): " + schoolName);
    }

    public static void main(String[] args) {
        // Creating object to access instance method
        VariableDemo obj = new VariableDemo();
        obj.showDetails();
    }
}
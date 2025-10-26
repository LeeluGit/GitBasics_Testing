public class DataTypeDemo {

    // Instance variables (primitive types)
    byte byteValue = 127;               // 1 byte
    short shortValue = 32000;           // 2 bytes
    int intValue = 100000;              // 4 bytes
    long longValue = 10000000000L;      // 8 bytes
    float floatValue = 5.75f;           // 4 bytes
    double doubleValue = 19.99;         // 8 bytes
    char charValue = 'A';               // 2 bytes
    boolean booleanValue = true;        // 1 bit

    // Static variable (non-primitive type)
    static String staticMessage = "Hello, Java!";

    public void showDataTypes() {
        // Local variable (non-primitive type)
        int[] numbers = {1, 2, 3, 4, 5};

        // Display primitive types
		System.out.println("Java Data Types are:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);

        // Display static and non-primitive types
        System.out.println("String: " + staticMessage);
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DataTypeDemo demo = new DataTypeDemo();
        demo.showDataTypes();
    }
}
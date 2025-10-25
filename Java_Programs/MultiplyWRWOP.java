import java.util.Scanner;

public class MultiplyWRWOP {

    // Method with return type and no parameters
    public static int multiply() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        return a * b; // returning the result
    }

    public static void main(String[] args) {
        int result = multiply(); // calling the method
        System.out.println("Multiplication result: " + result);
    }
}
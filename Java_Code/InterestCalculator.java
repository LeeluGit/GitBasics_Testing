public class InterestCalculator {

    public static void main(String[] args) {
        // Declare three variables
        double principal = 10000; // Principal amount in rupees
        double rate = 5.5;        // Annual interest rate in percent
        double time = 2;          // Time in years

        // Calculate simple interest
        double interest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("Principal: ₹" + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: ₹" + interest);
    }
}
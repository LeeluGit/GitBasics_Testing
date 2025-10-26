public class CircleAreaCalculator {

    // Method to calculate area of a circle
    public static double Area(double radius) {
        // Formula: π * r^2
        double area = Math.PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        double radius = 7.5;
        double result = Area(radius);
        System.out.println("Area of the circle with radius " + radius + " is: " + result);
    }
}
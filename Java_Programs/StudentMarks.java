import java.util.Scanner;

public class StudentMarks {

    // Method named after the student, with return type and no parameters
    public static int santhosh() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int sub3 = sc.nextInt();

        System.out.print("Enter marks for Subject 4: ");
        int sub4 = sc.nextInt();

        int total = sub1 + sub2 + sub3 + sub4;
        return total;
    }

    public static void main(String[] args) {
        int totalMarks = santhosh(); // calling the method
        System.out.println("Total Marks: " + totalMarks);
    }
}
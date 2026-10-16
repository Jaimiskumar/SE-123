import java.util.Scanner;

public class calculator {

    // Addition method
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Perform addition
        double result = add(num1, num2);
        System.out.println("Addition Result: " + result);

        sc.close();
    }
}

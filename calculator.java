import java.util.Scanner;

public class calculator {

    // Addition method
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction method
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication method
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Perform addition
        double addResult = add(num1, num2);
        System.out.println("Addition Result: " + addResult);

        // Perform subtraction
        double subResult = subtract(num1, num2);
        System.out.println("Subtraction Result: " + subResult);

        // Perform multiplication
        double mulResult = multiply(num1, num2);
        System.out.println("Multiplication Result: " + mulResult);

        sc.close();
    }
}

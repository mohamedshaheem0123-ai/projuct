import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("    Welcome to Java Calculator   ");
        System.out.println("=================================");

        while (true) {

            System.out.println("\nSelect an operation:");
            System.out.println("1. Add (+)");
            System.out.println("2. Subtract (-)");
            System.out.println("3. Multiply (*)");
            System.out.println("4. Divide (/)");
            System.out.println("5. Power (^)");
            System.out.println("6. Exit");
            System.out.print("Enter choice (1-6): ");

            int choice;

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 6.");
                scanner.next(); // Clear invalid input
                continue;
            }

            if (choice == 6) {
                System.out.println("Thank you for using Java Calculator. Goodbye!");
                break;
            }

            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice! Please choose a valid operation (1-6).");
                continue;
            }

            double num1 = getNumber(scanner, "Enter first number: ");
            double num2 = getNumber(scanner, "Enter second number: ");
            double result;

            switch (choice) {

                case 1:
                    result = num1 + num2;
                    System.out.printf("Result: %.4f + %.4f = %.4f%n", num1, num2, result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.printf("Result: %.4f - %.4f = %.4f%n", num1, num2, result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.printf("Result: %.4f * %.4f = %.4f%n", num1, num2, result);
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed!");
                    } else {
                        result = num1 / num2;
                        System.out.printf("Result: %.4f / %.4f = %.4f%n", num1, num2, result);
                    }
                    break;

                case 5:
                    result = Math.pow(num1, num2);
                    System.out.printf("Result: %.4f ^ %.4f = %.4f%n", num1, num2, result);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }

    private static double getNumber(Scanner scanner, String prompt) {

        while (true) {

            System.out.print(prompt);

            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }
    }
}
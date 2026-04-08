import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Possible calculations:");
        System.out.println("  (A)dd");
        System.out.println("  (S)ubtract");
        System.out.println("  (M)ultiply");
        System.out.println("  (D)ivide");

        System.out.print("Please select an option: ");
        char choice = scanner.next().toUpperCase().charAt(0);

        double result;

        if (choice == 'A') {
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        }
        else if (choice == 'S') {
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        }
        else if (choice == 'M') {
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        }
        else if (choice == 'D') {
            result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
        }
        else {
            System.out.println("Invalid option");
        }
    }
}
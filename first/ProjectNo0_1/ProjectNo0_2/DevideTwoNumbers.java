package ProjectNo0_2;

import java.util.Scanner;

public class DevideTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the sum of the two numbers
        int divide = num1 / num2;

        // Display the result
        System.out.println("The dividation of " + num1 + " and " + num2 + " is " + divide);

        // Close the scanner
        scanner.close();
    }
}

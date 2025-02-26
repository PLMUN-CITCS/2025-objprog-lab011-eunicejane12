import java.util.Scanner;

public class NumberClassifierMenu {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Declare a character variable for the user's decision to continue
        char userChoice;

        // Start a do-while loop for repeating the menu
        do {
            // Display the menu options
            System.out.println("\n=== Number Classifier Menu ===");
            System.out.println("1. Classify a number as positive, negative, or zero");
            System.out.println("2. Print a multiplication table for a given number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            // Read the user's menu choice
            int choice = input.nextInt();

            // Switch statement to handle menu options
            switch (choice) {
                case 1:
                    // Case 1: Classify Number
                    System.out.print("Enter a number to classify: ");
                    int number = input.nextInt();
                    // Classifying the number as positive, negative, or zero
                    if (number > 0) {
                        System.out.println("The number " + number + " is positive.");
                    } else if (number < 0) {
                        System.out.println("The number " + number + " is negative.");
                    } else {
                        System.out.println("The number is zero.");
                    }
                    // Check if the number is even or odd
                    if (number % 2 == 0) {
                        System.out.println("It is also an even number.");
                    } else {
                        System.out.println("It is an odd number.");
                    }
                    break;

                case 2:
                    // Case 2: Multiplication Table
                    System.out.print("Enter a number to display its multiplication table: ");
                    int tableNumber = input.nextInt();
                    System.out.println("Multiplication Table for " + tableNumber + ":");
                    // Print the multiplication table for the entered number
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
                    }
                    break;

                case 3:
                    // Case 3: Exit
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    // Invalid choice handling
                    System.out.println("Invalid option. Please choose between 1 and 3.");
                    break;
            }

            // Ask the user if they want to return to the menu
            System.out.print("Do you want to return to the menu? (Y/N): ");
            input.nextLine(); // Consume newline
            userChoice = input.nextLine().toUpperCase().charAt(0);

        } while (userChoice == 'Y'); // Continue if the user enters 'Y'

        // Close the scanner object to free resources
        input.close();
    }
}

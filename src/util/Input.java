package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter a string: ");
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userString = getString("Please enter yes or no: ");
        if (userString.equalsIgnoreCase("y") || userString.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            System.out.println("Invalid input.");
            return getInt(min, max);
        } else {
            return userInput;
        }
    }

    public int getInt() {
        System.out.println("Enter an integer: ");
        int userInput = scanner.nextInt();
        return userInput;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f: ", min, max);
        double userInput = scanner.nextDouble();
        if (userInput < min || userInput > max) {
            System.out.println("Invalid input.");
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }

    public double getDouble() {
        System.out.println("Enter a decimal number: ");
        double userInput = scanner.nextDouble();
        return userInput;
    }

}

package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userString = scanner.nextLine().toLowerCase();
        return userString.equalsIgnoreCase("y") || userString.equalsIgnoreCase("yes");
    }
//    stop work here for break
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
        int userInput = Integer.parseInt(getString(String.valueOf(Integer.valueOf(scanner.nextInt()))));
        try {
            return userInput;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
            return getInt();
        }
//        return userInput;
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

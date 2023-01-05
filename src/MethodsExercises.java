import java.util.Scanner;

public class MethodsExercises {
    public static Scanner scanner = new Scanner(System.in);

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
//        for (int i = 1; i < num2; i++) {
//            num1 += num1;
//        }
        return num1 * num2;
//        return num1;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println(userInput);
            return userInput;
        } else {
            System.out.println("Invalid input.");
            return getInteger(min, max);
        }
    }
    public static int factorial(int num){
        System.out.println("Enter an integer between 1 and 10: ");
        int userInput = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(num + "! )
        }
        return ;
    }


    public static void main(String[] args) {

        // 1. Basic Arithmetic
        // Addition
//        System.out.println(addition(5, 7));
        // Subtraction
//        System.out.println(subtraction(10, 5));
        // Multiplication
//        System.out.println(multiplication(5, 5));
        // Division
//        System.out.println(division(10, 3));
        // If you try to divide by 0, the code breaks.  Since you can't divide a number by zero I would think the one line should break.
        // Modulus
//        System.out.println(modulus(10, 3));
        // 2. Get Integer
//        getInteger(1, 732);
        // 3. Factorial
        factorial(5);
    }
}

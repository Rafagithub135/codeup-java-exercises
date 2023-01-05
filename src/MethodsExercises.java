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
        for (int i = 1; i < num2; i++) {
            num1 += num1;
        }
//        return num1 * num2;
        return num1;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }


    public static void main(String[] args) {

        // 1. Basic Arithmetic
        // Addition
        System.out.println(addition(5, 7));

        System.out.println(subtraction(10, 5));

        System.out.println(multiplication(5, 5));

        System.out.println(division(10, 3));
        // If you try to divide by 0, the code breaks.  Since you can't devide a number by zero I would think the one line should break.

        System.out.println(modulus(10, 3));
    }
}
//        public static int multiplication ( int num1, int num2){
//            return num1 * num2;
//        }
//
// Code from javatpoint.com/multiply-two-numbers-without-using-operator-in-java, modified slightly.
//        int x, y, sum = 0;
//        System.out.print("Enter first number to multiply: ");
//        x = scanner.nextint();
//        System.out.print("Enter second number to multiply: ");
//        y = scanner.nextint();
//        for (int i = 1; i <= x; i++) {
//            sum += y;
//        }
//        System.out.println("The product of " + x + " and " + y + " is " + sum);

//        public static int division ( int num1, int num2){
//            return num1 / num2;
//        }
//        public static int modulus ( int num1, int num2){
//            return num1 % num2;
//        }

//    }
//}


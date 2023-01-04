import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
// Loop Basics
//  While
        int a = 5;
        while (a <= 15) {
            System.out.print(a + " ");
            a++;
        }
//  Do While
        int b = 0;
        do {
            System.out.println(b);
            b += 2;
        } while (b <= 100);
        int c = 100;
        do {
            System.out.println(c);
            c -= 5;
        } while (c >= -10);
        long d = 2;
        do {
            System.out.println(d);
            d *= d;
        } while (d < 1000000);
//  For
            for (int e = 100; e >= -10; e -= 5) {
                System.out.println(e);
            }
            for (long f = 2; f < 1000000; f *= f) {
                System.out.println(f);
            }
// Fizzbuzz
          for (int g = 1; g <= 100; g++) {
            if (g % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (g % 3 == 0) {
                System.out.println("Fizz");
            } else if (g % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(g);
            }
          }
// Display a table of powers.
        Scanner powers = new Scanner(System.in);
        System.out.print("What number would you like to go up to? ");
        int userInt = powers.nextInt();
        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 1; i <= userInt; i++) {
            System.out.printf("%-6d | %-7d | %-5d%n", i, i * i, i * i * i);
        }
        System.out.print("Would you like to continue? [y/n] ");
        String userContinue = powers.next();
        if (userContinue.equalsIgnoreCase("y")) {
            System.out.print("What number would you like to go up to? ");
            userInt = powers.nextInt();
            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= userInt; i++) {
                System.out.printf("%-6d | %-7d | %-5d%n", i, i * i, i * i * i);
            }
        } else {
            System.out.println("Goodbye!");
        }
// Convert given number grades into letter grades.
        Scanner convertGrades = new Scanner(System.in);
        System.out.print("Enter a numerical grade from 0 to 100: ");
        int userGrade = convertGrades.nextInt();
        if (userGrade >= 95) {
            System.out.println("A+");
        } else if (userGrade >= 88) {
            System.out.println("A");
        } else if (userGrade >= 85) {
            System.out.println("B+");
        } else if (userGrade >= 80) {
            System.out.println("B");
        } else if (userGrade >= 75) {
            System.out.println("C+");
        } else if (userGrade >= 67) {
            System.out.println("C");
        } else if (userGrade >= 65) {
            System.out.println("D+");
        } else if (userGrade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        System.out.print("Would you like to continue? [y/n] ");
        String userContinue = convertGrades.next();
        if (userContinue.equalsIgnoreCase("y")){
            System.out.print("Enter a numerical grade from 0 to 100: ");
            userGrade = convertGrades.nextInt();
            if (userGrade >= 95) {
                System.out.println("A+");
            } else if (userGrade >= 88) {
                System.out.println("A");
            } else if (userGrade >= 85) {
                System.out.println("B+");
            } else if (userGrade >= 80) {
                System.out.println("B");
            } else if (userGrade >= 75) {
                System.out.println("C+");
            } else if (userGrade >= 67) {
                System.out.println("C");
            } else if (userGrade >= 65) {
                System.out.println("D+");
            } else if (userGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        } else {
            System.out.println("Goodbye!");
        }
    }
}

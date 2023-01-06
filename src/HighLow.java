import java.util.Scanner;

public class HighLow {
    public static Scanner scanner = new Scanner(System.in);

    public static void guessAgain() {
        if (scanner.next().equalsIgnoreCase("y")) {
            scanner.next();
        } else {
            return;
        }
    }

    public static void guessTheNumber() {
        int specNumber = (int) (Math.random() * 100);
        System.out.println("I'm thinking of a number between 1 and 100.  Can you guess it? You get 10 guesses.");
        boolean isCorrect = true;
        int count = 0;
        do {
            count++;
            if (count > 10) {
                return;
            }
            System.out.println(count);
            int number = scanner.nextInt();
            if (number == specNumber) {
                System.out.println("GOOD GUESS!");
                return;
            } else if (number < specNumber) {
                System.out.println("HIGHER");
            } else if (number > specNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("Invalid input. Continue? [y/n]");
                String userInput = scanner.next();
                if (userInput.equalsIgnoreCase("n")) {
                    isCorrect = false;
                }
            }
        } while (isCorrect);
    }

    public static void main(String[] args) {
        guessTheNumber();
    }
}
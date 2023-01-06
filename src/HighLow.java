import java.util.Scanner;

public class HighLow {
    public static Scanner scanner = new Scanner(System.in);

    public static void guessAgain() {
        if (scanner.next().equalsIgnoreCase("y")) {
            scanner.next();
        }
    }

    public static void guessTheNumber() {
        int specNumber = 33;
        System.out.println("I'm thinking of a number between 1 and 100.  Can you guess it?");
        int number = scanner.nextInt();
        boolean isCorrect = true;
        do {
            if (number > specNumber) {
                System.out.println("LOWER");
                System.out.println("Guess again? [y/n]");
                guessAgain();
            } else if (number < specNumber) {
                System.out.println("HIGHER");
                System.out.println("Guess again? [y/n]");
                guessAgain();
            } else if (number == specNumber) {
                System.out.println("GOOD GUESS!");
                return;
            } else {
                System.out.println("Invalid input. Continue? [y/n]");

                String userInput = scanner.next();
                if (userInput.equalsIgnoreCase("n")) {
                    isCorrect = false;
                }
            }
            } while (isCorrect) ;
            String userInput = scanner.next();
        }
        public static void main (String[]args){


            guessTheNumber();


//        (int) (Math.random() + 1);


        }
    }
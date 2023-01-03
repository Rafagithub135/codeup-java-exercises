import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s.%n", pi);

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a word: ");
//        String firstWord = scanner.next();
//        System.out.print("Enter a second word: ");
//        String secondWord = scanner.next();
//        System.out.print("Enter a third word: ");
//        String thirdWord = scanner.next();
//        System.out.printf("You entered: %s, %s, and %s.%n", firstWord, secondWord, thirdWord);
        // If less than three words are entered, the program will wait for the next input.
        // If more than three words are entered, the program will only print the first three words, even if they are on different lines.
//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.next();
        // If you enter a sentence, the program will only print the first word using the next method.
//        System.out.printf("You entered: %s.%n", sentence);
//        String sentence = scanner.nextLine();
        // If you enter a sentence, the program will print the entire sentence using the nextLine method.
        System.out.print("Enter the length of the room: ");
        String length = scanner.nextLine();
        System.out.print("Enter the width of the room: ");
        String width = scanner.nextLine();
        double lengthNum = Double.parseDouble(length);
        double widthNum = Double.parseDouble(width);
        double area = lengthNum * widthNum;
        double perimeter = (lengthNum * 2) + (widthNum * 2);
        System.out.printf("The area of the room is %s SqFt.%nThe perimeter of the room is %s Ft.%n", area, perimeter);
    }
}

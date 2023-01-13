package grades;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        Student john = new Student("John", new ArrayList<>());
        john.addGrade(90);
        john.addGrade(80);
        john.addGrade(70);
        john.addGrade(75);

        Student ralph = new Student("Ralph", new ArrayList<>());
        ralph.addGrade(93);
        ralph.addGrade(92);
        ralph.addGrade(92);
        ralph.addGrade(93);

        Student jessica = new Student("Jessica", new ArrayList<>());
        jessica.addGrade(100);
        jessica.addGrade(100);
        jessica.addGrade(95);
        jessica.addGrade(93);

        Student josh = new Student("Josh", new ArrayList<>());
        josh.addGrade(90);
        josh.addGrade(80);
        josh.addGrade(70);
        josh.addGrade(83);

        Map<String, Student> students = new HashMap<>();
        students.put("John316", john);
        students.put("Rafa135", ralph);
        students.put("Jessicode", jessica);
        students.put("Joshgentio", josh);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        while (true) {
            System.out.println("\nHere are the GitHub usernames of our students:\n");
            for (Map.Entry<String, Student> entry : students.entrySet()) {
                System.out.println("|" + entry.getKey() + "| ");
            }
            System.out.println("\nWhat student would you like to see more information on?");
            System.out.println("\n>");
        String userInput = scanner.nextLine();
        // GitHub Copilot
        if (!students.containsKey(userInput)) {
            System.out.println("Sorry, no student found with the GitHub username of \"" + userInput + "\".");
        } else {
            System.out.println("Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput);
            System.out.println("Current Average: " + students.get(userInput).getGradeAverage() + "\n");
        }
            System.out.println("Would you like to see another student?");
            System.out.println("\n>");
            String userResponse = scanner.nextLine();
            if ((!userResponse.equalsIgnoreCase("y")) && (!userResponse.equalsIgnoreCase("yes"))) {
                System.out.println("Goodbye, and have a wonderful day!");
                break;
            }
        }
    }
}


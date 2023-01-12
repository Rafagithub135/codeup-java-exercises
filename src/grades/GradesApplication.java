package grades;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    @Override
    public String toString() {
        return "GradesApplication{}";
    }

    public static void main(String[] args) {

        Student john = new Student("John", new ArrayList<>());
        john.addGrade(90);
        john.addGrade(80);
        john.addGrade(70);
        john.addGrade(75);

        Student ralph = new Student("Ralph", new ArrayList<>());
        ralph.addGrade(93);
        ralph.addGrade(92);
        ralph.addGrade(95);
        ralph.addGrade(98);

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

        HashMap<String, Student> students = new HashMap<>();
        students.put("John316", john);
        students.put("Rafa135", ralph);
        students.put("Jessicode", jessica);
        students.put("Joshgentio", josh);

        System.out.println("Welcome!");
        System.out.println("\nHere are the GitHub usernames of our students:\n");
        System.out.println(students);

//        Map<String, String> students = new HashMap<>();

//        System.out.println(studentNames.get("John316"));
    }
}


package grades;

import java.util.ArrayList;
public class StucentTest {
    public static void main(String[] args) {
        Student john = new Student("John", new ArrayList<>());
        john.addGrade(90);
        john.addGrade(80);
        john.addGrade(70);
        System.out.println(john.getName());
        System.out.println(john.getGradeAverage());
        Student ralph = new Student("Ralph", new ArrayList<>());
        ralph.addGrade(93);
        ralph.addGrade(92);
        System.out.println(ralph.getName());
        System.out.println(ralph.getGradeAverage());
    }
}

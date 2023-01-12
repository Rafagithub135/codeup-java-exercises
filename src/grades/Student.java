package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private int[] grades;

    ArrayList<Integer> grades = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}


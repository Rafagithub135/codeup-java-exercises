package grades;

public class StucentTest {
    public static void main(String[] args) {
        Student student = new Student(String "John");
        student.addGrade(90);
        student.addGrade(80);
        student.addGrade(70);
        System.out.println(student.getName());
        System.out.println(student.getGradeAverage());
    }
}

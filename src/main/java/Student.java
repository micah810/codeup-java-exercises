import java.util.ArrayList;

public class Student {
    //    ArrayList<Integer> grades = new ArrayList<>();
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        if (this.grades.size() == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return (double) sum / this.grades.size();
    }

//    public String getName();
//    public void addGrade(int grade);
//
//    public double getGradeAverage();
}
package md.smax.service;
import md.smax.model.Student;

public class StudentService {
//    Поля
    int studentsCount = 0;
    int gradeCount = 0;
    int maxGrade = Integer.MIN_VALUE;
    int minGrade = Integer.MAX_VALUE;
    Student maxGradeStudent = null;
    Student minGradeStudent = null;

    //    Методы
    public void addGrade(Student student, int grade) {
        studentsCount++;
        gradeCount += grade;

        if (grade > maxGrade) {
            maxGrade = grade;
            maxGradeStudent = student;
        }


        if (grade < minGrade) {
            minGrade = grade;
            minGradeStudent = student;
        }
    }

    public float getAverageGrade() {
        float averageGrade = gradeCount / studentsCount;
        return averageGrade;
    }

    public Student getBestStudent() {
        return maxGradeStudent;
    }

    public Student getWorstStudent() {
        return minGradeStudent;
    }
}

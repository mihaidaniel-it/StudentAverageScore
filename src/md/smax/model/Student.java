package md.smax.model;

public class Student {
    //    Поля
    public String studentName;
    public int studentClass;

//    Конструктор
public Student(String studentName, int studentClass) {
        this.studentName = studentName;
        this.studentClass = studentClass;
    }

//    Гетеры
    public String getStudentName() {
        return this.studentName;
    }

    public int getStudentClass() {
        return this.studentClass;
    }

//    Cетеры
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }
}

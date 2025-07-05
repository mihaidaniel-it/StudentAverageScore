package md.smax;
import md.smax.model.Student;
import md.smax.service.StudentService;

public class Main {
    public static void main(String[] args) {
//        Создаю объекты
        StudentService studentService = new StudentService();

        studentService.addGrade(new Student("Анна", 4), 58);
        studentService.addGrade(new Student("Екатерина", 6), 27);
        studentService.addGrade(new Student("Сергей", 8), 98);
        studentService.addGrade(new Student("Никита", 2), 11);
        studentService.addGrade(new Student("Иван", 9), 34);

//        Переменные
        Student bestStudent = studentService.getBestStudent();
        Student worstStudent = studentService.getWorstStudent();

//        Вывод в консоль
        System.out.println("Лучший студент " + bestStudent.getStudentName() + ", из класса " + bestStudent.getStudentClass());
        System.out.println("Худший студент " + worstStudent.getStudentName() + ", из класса " + worstStudent.getStudentClass());
        System.out.println("Средний балл учеников: " + studentService.getAverageGrade());
    }
}

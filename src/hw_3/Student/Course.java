package hw_3.Student;

import java.util.ArrayList;
import java.util.List;

public class Course {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "Кирилл", "Романов", "29.12.1995"));
        list.add(new Student(2, "Александр", "Борин", "15.05.1996"));
        list.add(new Student(1, "Василий", "Марков", "05.03.1996"));
        list.add(new Student(2, "Михаил", "Воронин", "29.10.1995"));
        list.add(new Student(1, "Петр", "Достоевский", "19.03.1996"));

        int course = 1;
        printStudents(list, course);

        course = 2;
        printStudents(list, course);
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты " + course + " курса:");

        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName()
                );
            }
        }
    }
}
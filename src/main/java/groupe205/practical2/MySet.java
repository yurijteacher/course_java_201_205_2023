package groupe205.practical2;

import java.util.HashSet;
import java.util.Set;

public class MySet {


    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        Student student = new Student();
        student.setId(1L);
        student.setFirstName("Vasya");
        student.setLastName("Pypkin");
        student.setAge(21);

        Student student1 = new Student();
        student1.setId(1L);
        student1.setFirstName("Ivanna");
        student1.setLastName("Pypkina");
        student1.setAge(18);

        Student student2 = new Student();
        student2.setId(1L);
        student2.setFirstName("Iva");
        student2.setLastName("Iva");
        student2.setAge(19);

        students.add(student);
        students.add(student1);
        students.add(student2);

        System.out.println(students);

        students.add(student);

        System.out.println(students);

    }




}

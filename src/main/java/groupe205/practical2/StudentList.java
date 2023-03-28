package groupe205.practical2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentList {

    public static void main(String[] args) {

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

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);

        System.out.println(studentList);

        studentList.stream().filter(e->e.getAge()>20).forEach(e->{
            System.out.println(e);
        });

       int minAge = studentList
               .stream()
               .min(Comparator.comparing(Student::getAge))
               .get()
               .getAge();

        System.out.println(minAge);
        Student studentMinAge = studentList
                .stream()
                .min(Comparator.comparing(Student::getAge))
                .get();

        List<Student> studentList1 = studentList
                .stream()
                .sorted(Comparator.comparing(Student::getAge))
                .collect(Collectors.toList());

        System.out.println(studentMinAge);

        System.out.println(studentList1);
    }
}

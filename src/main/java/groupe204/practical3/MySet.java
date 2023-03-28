package groupe204.practical3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MySet {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        set.add(1);

        set.remove(1);

        System.out.println(set);


        Set<Student> students = new HashSet<>();

        Student student = new Student();
        student.setId(1L);
        student.setFirstName("Vasya");
        student.setLastName("Pypkin");
        student.setAge(20);

        Student student1 = new Student();
        student1.setId(2L);
        student1.setFirstName("Iva");
        student1.setLastName("Pypkina");
        student1.setAge(18);

        Student student2 = new Student();
        student2.setId(3L);
        student2.setFirstName("Ira");
        student2.setLastName("Vs");
        student2.setAge(21);

        students.add(student);
        students.add(student1);
        students.add(student2);


        Student student3 = new Student();
        student3.setId(3L);
        student3.setFirstName("Ira");
        student3.setLastName("Vs");
        student3.setAge(21);

        System.out.println(students);

        students.add(student3);

        System.out.println(students);

       List<Student> studentList = students
               .stream()
               .sorted(Comparator.comparing(Student::getAge))
               .collect(Collectors.toList());

        System.out.println(studentList);

        Student student4= students.stream().min(Comparator.comparing(Student::getAge)).get();

        System.out.println(student4);
    }
}

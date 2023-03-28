package group202.practical3;

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

        System.out.println(set);


        Set<Student> students = new HashSet<>();

        Student s1 = new Student();
        s1.setId(1);
        s1.setFirstName("Vasya");
        s1.setLastName("Pypkin");
        s1.setAge(18);
        s1.setEmail("va@ukr.net");

        Student s2 = new Student();
        s2.setId(2);
        s2.setFirstName("Iva");
        s2.setLastName("Pypkina");
        s2.setAge(20);
        s2.setEmail("v@ukr.net");

        Student s3 = new Student();
        s3.setId(3);
        s3.setFirstName("Ivanna");
        s3.setLastName("Ir");
        s3.setAge(19);
        s3.setEmail("ivanka@ukr.net");

        students.add(s1);
        students.add(s2);
        students.add(s3);

//        System.out.println(students);

        //students.add(s3);

        System.out.println(students);

        Student s4 = new Student();
        s4.setId(3);
        s4.setFirstName("Ivanna");
        s4.setLastName("Ir");
        s4.setAge(19);
        s4.setEmail("ivanka@ukr.net");

        System.out.println(s4);

        System.out.println(students);


        List<Student> studentList = students
                .stream()
                .sorted(Comparator.comparing(Student::getAge))
                .collect(Collectors.toList());

        System.out.println(studentList);

        Student student = students
                .stream()
                .min(Comparator.comparing(Student::getAge))
                .get();

        System.out.println(student);

        student = students
                .stream()
                .max(Comparator.comparing(Student::getAge))
                .get();


        students.stream().filter(el -> (el.getAge() > 18)).forEach(System.out::println);

        System.out.println(student);
     }
}

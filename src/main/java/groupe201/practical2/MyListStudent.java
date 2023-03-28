package groupe201.practical2;

import java.util.*;
import java.util.stream.Collectors;

public class MyListStudent {


    public static void main(String[] args) {

        // List<Student>

        Student s1 = new Student();
        s1.setId(1L);
        s1.setFirstName("Vasya");
        s1.setLastName("Pypkin");
        s1.setAge(18);

        Student s2 = new Student();
        s2.setId(2L);
        s2.setFirstName("Iva");
        s2.setLastName("Pypkina");
        s2.setAge(20);

        Student s3 = new Student();
        s3.setId(3L);
        s3.setFirstName("Ivanna");
        s3.setLastName("Sma");
        s3.setAge(19);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(list);

        List<Student> sortStudent = list
                .stream()
                .sorted(Comparator.comparing(Student::getAge))
                .collect(Collectors.toList());

        System.out.println(sortStudent);

       Student studentMinAge = list
               .stream()
               .min(Comparator.comparing(Student::getAge))
               .get();

        System.out.println(studentMinAge);


        Student studentMaxAge = list
                .stream()
                .max(Comparator.comparing(Student::getAge))
                .get();

        System.out.println(studentMaxAge);

        list.add(s1);

        System.out.println(list);


        // Set<Student>

        Set<Student> set =new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s1);


        Student s5 = new Student();
        s5.setId(1L);
        s5.setFirstName("Vasya");
        s5.setLastName("Pypkin");
        s5.setAge(18);

        set.add(s5);

        System.out.println(set);

    }



}

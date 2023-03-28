package groupe203.practical3;

import java.util.HashSet;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {


        Set<Integer> list = new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.add(1);

        System.out.println(list);

        Set<Student> students = new HashSet<>();

        Student student1 = new Student();
        student1.setId(1L);
        student1.setFirstName("Iva");
        student1.setLastName("Iva");
        student1.setAge(23);

        Student student2 = new Student();
        student2.setId(2L);
        student2.setFirstName("Ivan");
        student2.setLastName("Ivan");
        student2.setAge(18);

        Student student3 = new Student();
        student3.setId(3L);
        student3.setFirstName("Ivanka");
        student3.setLastName("Ivanka");
        student3.setAge(19);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        System.out.println(students);


        Student student4= new Student();
        student4.setId(1L);
        student4.setFirstName("Iva");
        student4.setLastName("Iva");
        student4.setAge(23);

        students.add(student4);

        System.out.println(students);
    }
}

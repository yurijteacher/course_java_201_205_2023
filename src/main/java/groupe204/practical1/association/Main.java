package groupe204.practical1.association;


import groupe204.practical1.association.many_to_many.v2.StudentHasTeacher;
import groupe204.practical1.association.one_to_one.Student;
import groupe204.practical1.association.one_to_one.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(java.lang.String[] args) {

        Student student = new Student();
        student.setId(1);
        student.setFirstName("Vasya");
        student.setLastName("Pypkin");
        student.setAge(19);

        Teacher teacher = new Teacher();
        teacher.setStudent(student);
        teacher.setTeach("OOP");

        System.out.println("one_to_one:" + teacher);


        groupe204.practical1.association.one_to_many.Student student1 = new groupe204.practical1.association.one_to_many.Student();
        student1.setId(1);
        student1.setFirstName("Vasya");
        student1.setLastName("Pypkin");
        student1.setAge(19);


        groupe204.practical1.association.one_to_many.Student student2 = new groupe204.practical1.association.one_to_many.Student();
        student2.setId(2);
        student2.setFirstName("Maria");
        student2.setLastName("Pypkina");
        student2.setAge(21);


        groupe204.practical1.association.one_to_many.Teacher teacher1 = new groupe204.practical1.association.one_to_many.Teacher();
        teacher1.setDiscipline("C#");

        List<groupe204.practical1.association.one_to_many.Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        teacher1.setStudents(students);

        System.out.println("one_to_many:" + teacher1);


        groupe204.practical1.association.many_to_many.v2.Teacher teacher2 =new groupe204.practical1.association.many_to_many.v2.Teacher();
        teacher2.setTeach("JAVA");

        groupe204.practical1.association.many_to_many.v2.Teacher teacher3 =new groupe204.practical1.association.many_to_many.v2.Teacher();
        teacher3.setTeach("C++");

        groupe204.practical1.association.many_to_many.v2.Student student3 = new groupe204.practical1.association.many_to_many.v2.Student();
        student3.setId(1);
        student3.setFirstName("Maria");
        student3.setLastName("Pypkina");
        student3.setAge(18);

        groupe204.practical1.association.many_to_many.v2.Student student4 = new groupe204.practical1.association.many_to_many.v2.Student();
        student4.setId(2);
        student4.setFirstName("Ivan");
        student4.setLastName("Pypkin");
        student4.setAge(20);

        StudentHasTeacher studentHasTeacher = new StudentHasTeacher();
        studentHasTeacher.setTeacher(teacher2);
        studentHasTeacher.setStudent(student3);

        StudentHasTeacher studentHasTeacher1 = new StudentHasTeacher();
        studentHasTeacher1.setTeacher(teacher2);
        studentHasTeacher1.setStudent(student4);


        StudentHasTeacher studentHasTeacher2 = new StudentHasTeacher();
        studentHasTeacher2.setTeacher(teacher3);
        studentHasTeacher2.setStudent(student3);

        StudentHasTeacher studentHasTeacher3 = new StudentHasTeacher();
        studentHasTeacher3.setTeacher(teacher3);
        studentHasTeacher3.setStudent(student4);


        List<StudentHasTeacher> studentHasTeachers = new ArrayList<>();
        studentHasTeachers.add(studentHasTeacher);
        studentHasTeachers.add(studentHasTeacher1);
        studentHasTeachers.add(studentHasTeacher2);
        studentHasTeachers.add(studentHasTeacher3);

        for (StudentHasTeacher el: studentHasTeachers) {
            System.out.println("many_to_many:" + el);
        }

    }

}

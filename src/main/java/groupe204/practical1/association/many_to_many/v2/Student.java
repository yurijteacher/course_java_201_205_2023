package groupe204.practical1.association.many_to_many.v2;

import java.util.List;

public class Student {

    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private List<StudentHasTeacher> studentHasTeachers;

    public Student() {
    }

    public Student(long id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<StudentHasTeacher> getStudentHasTeachers() {
        return studentHasTeachers;
    }

    public void setStudentHasTeachers(List<StudentHasTeacher> studentHasTeachers) {
        this.studentHasTeachers = studentHasTeachers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

package groupe204.practical1.association.many_to_many.v1;

import groupe204.practical1.association.one_to_one.Teacher;

import java.util.List;

public class Student {

    private long id;
    private String firstName;
    private Student lastName;
    private int age;
    private List<Teacher> teachers;

    public Student() {
    }

    public Student(long id, String firstName, Student lastName, int age, List<Teacher> teachers) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.teachers = teachers;
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

    public Student getLastName() {
        return lastName;
    }

    public void setLastName(Student lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName=" + lastName +
                ", age=" + age +
                ", teachers=" + teachers +
                '}';
    }
}

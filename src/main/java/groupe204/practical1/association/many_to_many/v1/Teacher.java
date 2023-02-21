package groupe204.practical1.association.many_to_many.v1;

import java.util.List;

public class Teacher {
    private Student teach;
    private List<Student> students;

    public Teacher() {}

    public Teacher(Student teach, List<Student> students) {
        this.teach = teach;
        this.students = students;
    }

    public Student getTeach() {
        return teach;
    }

    public void setTeach(Student teach) {
        this.teach = teach;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

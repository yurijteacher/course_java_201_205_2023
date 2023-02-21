package groupe204.practical1.association.many_to_many.v2;

import java.util.List;

public class Teacher {
    private String teach;
    private List<StudentHasTeacher> studentHasTeacherList;

    public Teacher() {
    }

    public Teacher(String teach, List<StudentHasTeacher> studentHasTeacherList) {
        this.teach = teach;
        this.studentHasTeacherList = studentHasTeacherList;
    }

    public String getTeach() {
        return teach;
    }

    public void setTeach(String teach) {
        this.teach = teach;
    }

    public List<StudentHasTeacher> getStudentHasTeacherList() {
        return studentHasTeacherList;
    }

    public void setStudentHasTeacherList(List<StudentHasTeacher> studentHasTeacherList) {
        this.studentHasTeacherList = studentHasTeacherList;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teach='" + teach + '\'' +
                '}';
    }
}

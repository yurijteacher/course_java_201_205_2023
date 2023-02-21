package groupe204.practical1.association.one_to_one;

public class Teacher {

    private String teach;
    private Student student;

    public Teacher() {
    }

    public Teacher(String teach, Student student) {
        this.teach = teach;
        this.student = student;
    }

    public String getTeach() {
        return teach;
    }

    public void setTeach(String teach) {
        this.teach = teach;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teach='" + teach + '\'' +
                ", student=" + student +
                '}';
    }
}

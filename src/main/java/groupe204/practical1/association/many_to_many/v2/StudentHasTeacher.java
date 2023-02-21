package groupe204.practical1.association.many_to_many.v2;

import java.util.Date;

public class StudentHasTeacher {

    private Teacher teacher;
    private Student student;
    private String discipline;
    private Date open;
    private Date close;

    public StudentHasTeacher() {
    }

    public StudentHasTeacher(Teacher teacher, Student student, String discipline, Date open, Date close) {
        this.teacher = teacher;
        this.student = student;
        this.discipline = discipline;
        this.open = open;
        this.close = close;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public Date getOpen() {
        return open;
    }

    public void setOpen(Date open) {
        this.open = open;
    }

    public Date getClose() {
        return close;
    }

    public void setClose(Date close) {
        this.close = close;
    }

    @Override
    public String toString() {
        return "StudentHasTeacher{" +
                "teacher=" + teacher +
                ", student=" + student +
                ", discipline='" + discipline + '\'' +
                ", open=" + open +
                ", close=" + close +
                '}';
    }
}

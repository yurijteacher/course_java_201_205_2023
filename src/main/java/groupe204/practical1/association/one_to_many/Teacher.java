package groupe204.practical1.association.one_to_many;

import java.util.List;

public class Teacher {
    private String discipline;
    private List<Student> students;

    public Teacher() {}

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "discipline='" + discipline + '\'' +
                ", students=" + students +
                '}';
    }
}

package lecture2.patterns.structural_patterns.mvc;

public class Main {


    public static void main(String[] args) {

        StudentModel student = new StudentModel();
        student.setId(1L);
        student.setFirstName("Vasya");
        student.setLastName("Pypkin");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.printListStudents();
    }

}

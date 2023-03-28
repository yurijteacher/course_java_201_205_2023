package lecture2.patterns.structural_patterns.mvc;

public class StudentController {

    private StudentModel model;
    private StudentView view;

    public StudentController() {
    }

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void printListStudents(){
        view.print(model.getId(), model.getFirstName(), model.getLastName());
    }


}

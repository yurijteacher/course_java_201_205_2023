package lecture2.patterns.structural_patterns.mvc;

public class StudentView {

    public void print(Long id, String firstName, String lastName){
        System.out.println("Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}');
    }


}

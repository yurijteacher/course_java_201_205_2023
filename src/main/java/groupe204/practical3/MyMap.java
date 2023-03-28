package groupe204.practical3;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {


        Map<Long, Student> studentMap = new HashMap<>();

        Student student = new Student();
        student.setId(1L);
        student.setFirstName("Vasya");
        student.setLastName("Pypkin");
        student.setAge(20);

        Student student1 = new Student();
        student1.setId(2L);
        student1.setFirstName("Iva");
        student1.setLastName("Pypkina");
        student1.setAge(18);

        Student student2 = new Student();
        student2.setId(3L);
        student2.setFirstName("Ira");
        student2.setLastName("Vs");
        student2.setAge(21);


        studentMap.put(1L, student);
        studentMap.put(2L, student1);
        studentMap.put(3L, student2);

        for (Map.Entry<Long, Student> el :
             studentMap.entrySet()) {
            System.out.println(el.getKey() + ", " + el.getValue());
        }


        System.out.println(studentMap.get(2L));

    }
}

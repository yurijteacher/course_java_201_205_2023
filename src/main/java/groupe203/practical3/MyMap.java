package groupe203.practical3;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {

        Map<Long, Student> studentMap = new HashMap<>();

        Student student1 = new Student();
        student1.setId(1L);
        student1.setFirstName("Iva");
        student1.setLastName("Iva");
        student1.setAge(23);

        Student student2 = new Student();
        student2.setId(2L);
        student2.setFirstName("Ivan");
        student2.setLastName("Ivan");
        student2.setAge(18);

        Student student3 = new Student();
        student3.setId(3L);
        student3.setFirstName("Ivanka");
        student3.setLastName("Ivanka");
        student3.setAge(19);

        studentMap.put(1L, student1);
        studentMap.put(2L, student2);
        studentMap.put(3L, student3);

        Student student = studentMap.get(3L);

        System.out.println(student);

        for (Map.Entry<Long, Student> el : studentMap.entrySet()) {
            System.out.println(el.getKey() + ", " + el.getValue());
        }



    }
}

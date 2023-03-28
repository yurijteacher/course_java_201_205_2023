package groupe205.practical2;

import java.util.LinkedList;

public class MyLinkedList {

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1L);
        student.setFirstName("Vasya");
        student.setLastName("Pypkin");
        student.setAge(21);

        Student student1 = new Student();
        student1.setId(2L);
        student1.setFirstName("Ivanna");
        student1.setLastName("Pypkina");
        student1.setAge(18);

        Student student2 = new Student();
        student2.setId(3L);
        student2.setFirstName("Iva");
        student2.setLastName("Iva");
        student2.setAge(19);

        LinkedList<Student> linkedList = new LinkedList<>();

        linkedList.add(student);
        linkedList.add(student2);
        linkedList.add(student1);


        linkedList.addFirst(new Student(4L, "A","AA",25));
        linkedList.addLast(new Student(5L,"A","AAA",32));
        linkedList.add(1,new Student(6L,"A","AAA",32));

        linkedList.removeFirst();
        linkedList.removeLast();


        System.out.println(linkedList);


        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.pollFirst();
        linkedList.pollLast();

        System.out.println(linkedList);


    }
}

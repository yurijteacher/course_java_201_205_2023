package group202.practical3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

    /*
    TreeSet — це клас, який реалізує інтерфейс Set і використовує структуру даних на основі дерева
    для зберігання елементів у відсортованому порядку. Елементи впорядковуються за допомогою їх природного
    порядку або за допомогою спеціального компаратора, наданого під час створення TreeSet.
     */
public class MyTreeSet {

    public static void main(String[] args) {
        // сортування у прямому порядку
        TreeSet<Integer> set = new TreeSet<>(Comparator.naturalOrder());
        set.add(7);
        set.add(1);
        set.add(9);

        System.out.println(set);

        // сортування у зворотньому порядку
        TreeSet<Integer> set1 = new TreeSet<>(Comparator.reverseOrder());

        set1.add(7);
        set1.add(2);
        set1.add(5);
        System.out.println(set1);


        TreeSet<Integer> set3 = new TreeSet<>(Arrays.asList(1, 2, 3));
        TreeSet<Integer> set4 = new TreeSet<>(Arrays.asList(2, 3, 4));

        // Union - об'єднання без повтору елементів
        TreeSet<Integer> union = new TreeSet<>(set3);
        union.addAll(set4); // {1, 2, 3, 4}
        System.out.println(union);

        // Intersection (перетин елементів)
        TreeSet<Integer> intersection = new TreeSet<>(set3);
        intersection.retainAll(set4); // {2, 3}
        System.out.println(intersection);

        // Difference (різниця елементів)
        TreeSet<Integer> difference = new TreeSet<>(set3);
        difference.removeAll(set4); // {1}
        System.out.println(difference);


    }
}

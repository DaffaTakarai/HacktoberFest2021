package CollectionsFramework_in_Java;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_class_in_java {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>(List.of(10, 20, 30, 40));

        l1.add(1);
        l1.addAll(l2);
        System.out.println(l1);
        l1.add(1, 2);
        System.out.println(l1);

        System.out.println(l1.peek());
        l1.pop();
        System.out.println(l1);
    }
}

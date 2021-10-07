package CollectionsFramework_in_Java;
import java.util.*;

public class TreeMap_in_Collections {
    public static void main(String[] args) {

        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(1,"Akash", 2,"Varun", 3, "Pawan",4, "Abhishek"));
        System.out.println(tm);

        tm.put(5, "Charterjee");
        tm.put(6, "Pooja");

        System.out.println(tm);

        System.out.println(tm.pollFirstEntry());
        System.out.println(tm.firstEntry());
        System.out.println(tm.firstKey());
        System.out.println(tm.get(3));
    }
}

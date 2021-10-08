package CollectionsFramework_in_Java;

public class LinkedHashMap {
    public static void main(String[] args) {

        java.util.LinkedHashMap<Integer, String> lhm = new java.util.LinkedHashMap<>(5);

        lhm.put(1, "Akash");
        lhm.put(2, "Abhsihek");
        lhm.put(3, "Pawan");
        lhm.put(4, "Varun");
        lhm.put(5, "Chatterjee");
        lhm.put(6, "Patel");
        lhm.put(9, "Deepak");
        lhm.put(7, "Neelesh");

        System.out.println(lhm.get(4));

        lhm.forEach((k, v) -> System.out.println(k + " " + v));
    }
}

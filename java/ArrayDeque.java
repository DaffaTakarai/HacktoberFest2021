package CollectionsFramework_in_Java;

public class ArrayDeque {
    public static void main(String[] args) {
        java.util.ArrayDeque<String> names = new java.util.ArrayDeque<>();

        // offerLast is used to add elements at last of the ArrayDeque
        names.offerLast("Akash");
        names.offerLast("Deepak");
        names.offerLast("Arti");
        names.offerLast("Pooja");

        System.out.println(names);

//        for(String n : names){
//            System.out.print(n + " ");
//        }


        // offerLast is used to add elements at first place of the ArrayDeque
        names.offerFirst("Abhishek");
        names.offerFirst("Chatterjee");

        System.out.println(names);

        names.offerLast("Varun");
        names.offerLast("Pawan");

        System.out.println(names);

        // pollFirst is used to remove the first element of the ArrayDeque
        names.pollFirst();
        System.out.println(names);
    }
}

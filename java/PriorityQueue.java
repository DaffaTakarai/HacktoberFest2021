package CollectionsFramework_in_Java;

import java.util.Comparator;

class MyCom implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {

        if(o1 < o2) return 1;
        if(o1 > o2) return -1;
        return 0;
    }
}

public class PriorityQueue {
    public static void main(String[] args) {

        java.util.PriorityQueue<Integer> p = new java.util.PriorityQueue<>();
        p.add(10);
        p.add(29);
        p.add(3);
        p.add(13);

        for(int n : p){

            System.out.print(n + " ");
        }
        System.out.println();

        java.util.PriorityQueue<Integer> p1 = new java.util.PriorityQueue<>(new MyCom());
        p1.add(10);
        p1.add(3);
        p1.add(23);

        for(int n : p1){

            System.out.print(n + " ");
        }
    }
}

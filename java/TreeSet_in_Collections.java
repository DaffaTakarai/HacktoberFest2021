package CollectionsFramework_in_Java;
import java.util.*;

class point implements Comparable<point>{

    int x;
    int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){

        return "X : " + x + " " + "Y : " + y;
    }

    @Override
    public int compareTo(point p) {

        if(this.x < p.x)
            return -1;
        else if(this.x > p.x)
            return 1;
        else{
            if(this.y < p.y)
                return -1;
            else if(this.y > p.y)
                return 1;
            else
                return 0;
        }
    }
}

public class TreeSet_in_Collections {
    public static void main(String[] args) {

//        TreeSet<Integer> ts = new TreeSet<>(List.of(10, 20, 15, 30, 23, 38, 10, 20));
//        ts.add(70);
//        System.out.println(ts.ceiling(50));
//        System.out.println(ts.contains(50));
//        System.out.println(ts.first());
//        System.out.println(ts.isEmpty());
//        System.out.println(ts.size());
//        System.out.println(ts);

        TreeSet<point> ts1 = new TreeSet<>();
        ts1.add(new point(1,1));
        ts1.add(new point(5, 5));
        ts1.add(new point(5, 2));

        System.out.println(ts1);
    }
}

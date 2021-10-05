package arraynarraylist;
import java.util.ArrayList;
import java.util.Scanner;

class arraylist{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>();
        list.add(67);
        for(int i=0;i<3;i++)
        list.add(sc.nextInt());

      /*  for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());//this is 2D representation of list 
            }
        }*/
        
        System.out.println(list);

    }
}
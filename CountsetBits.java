/*brian kernighan algorithm - 
if we do n&n-1 then all bits after rightmost set bit are flipped including rightmost bit and each time 
we increment count value*/ 
import java.util.Scanner;
public class CountsetBits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        s.close();
        int count=0;
        while(n>0){
            count++;
            n=n&(n-1);
        }
         System.out.println("number of set bits are " +count);
    }
}

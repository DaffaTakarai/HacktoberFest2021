
import java.util.Scanner;

public class zeroCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number you want to find count of Zeroes of :");                     
        long num = in.nextLong();                                                                               // taking in the long number from User
        System.out.println("Here's the number of Zeroes inside " + num + " : " + count(num));                   // Method Call for Zeroes count
    }
        static long count(long n){                                                                              
        return helper(n, 0);                                                                                 // Helper Method Call to find Zeroes and count them
        }

        static long helper(long n, int c){
                if(n==0){                                                                                       // Terminating statement
                    return c;
                }
                long rem = n%10;
                if(rem == 0){                                                                                   // Recursive Part for counting
                    return helper(n/10, c +1);                                                          
                }
                return helper(n/10, c);
        }
}

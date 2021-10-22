
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int gcd(int a, int b) 
    { 
        // Everything divides 0  
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a; 

        if (a == b) 
            return a; 
        if (a > b) 
            return gcd(a-b, b); 
        return gcd(a, b-a); 
    } 
    public static int find(int[] a,int n)
    {
        int result=a[0];
        for(int i=1;i<n;i++)
        {
            result=gcd(a[i],result);
            if(result==1)
            {
                return 1;
            }
        
        }
    return result;
    }
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
	    {
	        int n=sc.nextInt();
	        int[] a=new int[n];
	        for(int j=0;j<n;j++)
	        {
	            a[j]=sc.nextInt();
	        }
	        System.out.println(find(a,n));
	    }
	}
}

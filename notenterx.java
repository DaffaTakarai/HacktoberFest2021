// This program takes input till 'x' is not  entered and give total sum of all entered values and also give largest entered number.   


import java.util.*;

class notenterX{
    public static void main(String arr[]){
        Scanner scan = new Scanner(System.in);
       
        String n;
        int i=0,a;
        int large=0;

        while(true){
            System.out.println("Enter values-: ");
            n=scan.next();
            if("x".equals(n))
            {
                break;
            }
            else{
                i=i+Integer.parseInt(n);
                a=Integer.parseInt(n);
                if(large<a)
                {
                    large=a;
                }
                else{
                    continue;
                }
            }
        }
        System.out.println("total sum -: "+i);
        System.out.println("the largest number -: "+large );
    }
}

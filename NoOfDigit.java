package com.company;

import java.util.Scanner;

public class NoOfDigit
{
    int n,count;
    Scanner s=new Scanner(System.in);
    int noOfDigit()
    {
        n=s.nextInt();
         count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        return count;
    }


    public static void main(String [] args)
        {

        NoOfDigit m=new NoOfDigit();
        Scanner s=new Scanner(System.in);
        m.noOfDigit();
    }
}

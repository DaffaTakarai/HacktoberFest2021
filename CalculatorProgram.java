import java.util.Scanner;
public class CalculatorProgram {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //Take input from from user till user press x or X
       int ans = 0;
       while(true) {
    	   System.out.println("Enter the operator:  ");
       char op = sc.next().trim().charAt(0);
       if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
    	   //input two numbers
    	   System.out.print("Input first num: ");
    	   int num1 = sc.nextInt();
    			   System.out.println("input 2nd num: ");
    	   int num2 = sc.nextInt();
    	   
    	   if(op == '+') {
    		   ans = num1 + num2;
    	   }
    	   if(op == '-') {
    		   ans = num1 - num2;
    	   }
    	   if(op == '*') {
    		   ans = num1 * num2;
    	   }
    	   if(op == '/') {
    		   if(num2 != 0) {
    		   ans = num1 / num2;
    		   }
    	   }
    	   if(op == '%') {
    		   ans = num1 % num2;
    	   }
    	   else if(op == 'x' || op == 'X') {
    		   break;
    	   }else {
    		   System.out.println("Invalid operation");
    	   }
    	   System.out.println(ans);
       }
       }
       
	}
}

// Logic for reverse string without using reverse function.
import java.util.*;
public class ReverseStringUsingStack{
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char ch[] = str.toCharArray();
		
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<ch.length;i++) {
			stack.push(ch[i]);
		}
		for(int i=0;i<ch.length;i++) {
			ch[i] = stack.pop();
		}
		String str1 =  new String(ch);
		System.out.println(str1);
   }
}


import java.util.Scanner;

public class StringToInt {

    static int stringtointeger(String str) {
        int i = 0;
        if (str == null || str.length() < 1) {
            return 0;
        }

        str = str.trim();

        char sign = '+';
        if (str.charAt(0) == '-') {
            sign = '-';
//            i++;
        } else if (str.charAt(0) == '+'){
//            i++;
        }

        int result = 0;
        for( ; i<str.length(); i++){
            int curr = str.charAt(i) - '0';
            if(curr>=0 && curr<=9) {
                if (result == 0){
                    result = curr;
                }
                else if(result != 0){
                    result = result*10 + curr;
                }
                else if (result > Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                else if (result < Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
            }
            else {
                break;
            }
        }
        if(sign == '-')
            return - result;
        return result;
    }

        public static void main (String[]args){
            System.out.println("Enter a String to convert to Int: ");
            Scanner stringchoice = new Scanner(System.in);
            String choice = stringchoice.next();

            System.out.println("Converted int: " + stringtointeger(choice));
        }
}

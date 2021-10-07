package RegExDemo;
import java.util.regex.*;

public class Valid_Invalid_MobileNumber {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");  // regex for valid mobile number
        Matcher m = p.matcher(args[0]);
        if(m.find() && m.group().equals(args[0])){
            System.out.println("Valid Mobile Number");
        }
        else{
            System.out.println("Invalid Mobile Number");
        }
    }
}

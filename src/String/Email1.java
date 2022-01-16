package String;

import java.util.Scanner;

public class Email1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String email = s.next();

        if(email.contains("_")){
            String firstName= email.substring(0,email.indexOf("_"));
            String lastName =email.substring(email.indexOf("_")+1,email.indexOf("@"));
            String domain = email.substring(email.indexOf("@")+1);
            System.out.println(lastName+"_"+firstName+"@"+domain);
        }else{
            System.out.println(email);
        }
    }
}
/*
Swap first name with last name in the email
(Seperated by an underscore). If the email doesn't contain an
underscore print the given input email.

Examples:

input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
input: barakobama@gmail.com

output: barakobama@gmail.com
 */
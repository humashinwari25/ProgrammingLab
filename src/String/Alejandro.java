package String;

import java.util.Scanner;

public class Alejandro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
      //  String a = "";
        //input.nextLine();
        String name = "alejandro";
        if(a.contains(name)){
            System.out.println("read");
        }else{
            System.out.println("don't read");
        }
        s.close();
    }
}
/*
Alejandro has many emails and only has time to read the
emails that refer to him. Check if his name is found in the
email and if it does print "read", but if his name is not in the
email print "don't read"

Examples:

a = "dear alejandro.....alot of text"

output: "read"
a = "dear alejandro.....alot of text"

output: "read"
a = "thunder blaz is the best drink in the galaxy..."

output: "don't read"
a = "thunder blaz is the best drink in the galaxy..."

output: "don't read"
a = "subject : important project, alejandro we refer to you  this ...."

output: "read"
 */
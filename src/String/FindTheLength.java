package String;

import java.util.Scanner;

public class FindTheLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String s1 = scan.next();
        int length = s1.length();
        System.out.println(""+ "Display message: Length is: " + length  + "\" ");


    }
}
/*
Write a program that will output length of the text (string).

Example:

Display message: "Please enter the text:"

input: java
input: java
Display message: "Length is: 4"
 */
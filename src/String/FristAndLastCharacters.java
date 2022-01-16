package String;

import java.util.Scanner;

public class FristAndLastCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char first = word.charAt(0);
    char last =word.charAt(word.length()-1);


        System.out.println(first);
        System.out.println(last);
        System.out.println(""+ first+last);

    }
}
/*
Write a program that will print out first and last letters together.

Input: adobe
Input: adobe
Output: ae
 */
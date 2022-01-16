package String;

import java.util.Scanner;

public class PrintHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String halfWord = (word.substring(0, word.length() / 2));
        System.out.println(halfWord.repeat(2));
    }
}
/*
Write a program that will print out first half of the word twice.

Example:

input: java

output: jaja

input: unity

output: unun
 */
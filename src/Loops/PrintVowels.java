package Loops;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        String result = "";
        for (int i = 0; i <word.length(); i++) {
            char each = word.charAt(i);
            if(each == 'a' ||each  == 'e' || each == 'i' || each == 'o' || each == 'u'){
                result += each;
            }

        }
        System.out.println(result);
    }
}
/*
Create a program that will take the given String In and print out all the vowels from the String.

Example:

Input: howdyho

Output: oo
Input: howdyho

Output: oo
Input: huehuehuehue

Output: ueueueue
 */
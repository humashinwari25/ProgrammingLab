package String;

import java.util.Scanner;

public class PrintTheLongestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        int s1 = word1.length();
        int s2 = word2.length();

        if (s1 >= s2){
            System.out.println(word1);
        }else
            System.out.println(word2);

        scan.close();

    }
}
/*
Write a program that will print out the longest word.
 Note: Assume the length of the two given Strings will be different

input:
bill
check
input:
bill
check
output: check
 */
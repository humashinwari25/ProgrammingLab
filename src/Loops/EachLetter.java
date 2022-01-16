package Loops;
import java.util.Scanner;
public class EachLetter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        //write your code below

        for (char i = 0; i <word.length() ; i++) {
            char each = word.charAt(i);
            System.out.println(each);
        }

    }

        }

/*
Given a String, use a loop to print every character from
the String on a new line.

Examples:

Input: hello
h
e
l
l
o
Input: hello
h
e
l
l
o
Input: zimbabwe
z
i
m
b
a
b
w
e
Input: zimbabwe
z
i
m
b
a
b
w
e
Input: wow!
w
o
w
!
 */
package String;

import java.util.Scanner;

public class ReverseIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word =scan.next();
        String output ="";

        if(word.length()==5){
            for (int i = word.length()-1; i >=0; i--) {
                output += word.charAt(i);
            }
        }else if(word.length() >5){
           output ="Too long!";
        }else{
            output = "Too short!";
        }
scan.close();
        System.out.println(output);
    }
}
/*
Write a program that will reverse a string. Your program
should reverse a string only 5 characters long. If word is shorter,
 display message: "Too short!". If word is longer,
 display message: "Too long!". Otherwise, reverse this word
  and print out result into the console.

Example:

input: cat

output: Too short!
input: cat

output: Too short!
input: singularity

output: Too long!
input: singularity

output: Too long!
input: apple

output: elppa
 */
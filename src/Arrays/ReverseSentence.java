package Arrays;

import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String [] words = sentence.split(" ");  //get each word in array

        for (int i = words.length-1; i >= 0 ; i--) {

            System.out.print(words[i]+ " ");
        }

        }


}
/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:

sentence -> Java is fun
​
reversed > fun is Java
 */
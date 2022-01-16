package Arrays;

import java.util.Scanner;

public class PrintFirstAndLastChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below


        for (int i = 0; i < words.length; i++) {


            String currentStr = words[i];
            int charCount = currentStr.length();
            System.out.println(currentStr.charAt(0) + ""+ currentStr.charAt(charCount-1));
        }
    }
}
/*


    Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

        Example:

        words → ["hello", "why", "by", "apple" , "note"]
        ​
        print:
        ho
        wy
        by
        ae
        ne

 */
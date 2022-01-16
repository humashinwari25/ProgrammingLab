package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {


    public static boolean isAnagram(String word1, String word2) {
        boolean result = false;
        word1=word1.toLowerCase();
        word2=word2.toLowerCase();
        String[] arr1 = word1.split("");
        String[] arr2 = word2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            result=true;

        }else{
            result=false;
        }
        return result;
    }

    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));

        in.close();
    }

}
   /*

Anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.

The isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.

each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive
Examples:

isAnagram("listen", "Silent") ==> true
isAnagram("listen", "Silent") ==> true
isAnagram("earth", "heart") ==> true
isAnagram("earth", "heart") ==> true
isAnagram("star", "rats") ==> true
isAnagram("star", "rats") ==> true
isAnagram("hi", "bye") ==> false
isAnagram("hi", "bye") ==> false
isAnagram("java", "cava") ==> false
 */
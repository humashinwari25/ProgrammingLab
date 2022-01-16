package Loops;

import java.util.Scanner;

public class EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int frequencyOfJava = 0;
        int frequencyOfPython = 0;

        while(sentence.contains("java")){
            frequencyOfJava++;
            sentence = sentence.replaceFirst("java", "");
        }
        while(sentence.contains("python")){
            frequencyOfPython++;
            sentence = sentence.replaceFirst("python", "");
        }
        boolean equal = frequencyOfJava == frequencyOfPython;

        System.out.println(equal);
    }
}
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).

Example:

input: We study java not python
​
output: true
input: We study java not python

output: true
Example:

input: What's the difference between java, javascript and python?
​
output: false
 */
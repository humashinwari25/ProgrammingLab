package Statements;
import java.util.Scanner;
public class PositiveNegativeZero {

        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            int num = s.nextInt();

            //Weite your code here:

            if(num > 0){
                System.out.println("positive");
            }else if(num < 0) {
                System.out.println("negative");
            }else{
                System.out.println("zero");
            }
        }
    }
/*
Given int num check if the number is positive, negative, or zero

Hint: use 3 if statements to do this

Examples:

num  = 1

positive
num  = 1

positive
num = -6

negative
num = -6

negative
num = 0

zero
 */
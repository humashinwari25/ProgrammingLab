package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        long result = 1;

        for (int i = n; i >=1 ; i--) {
            result *= i;

        }
        System.out.println(result);

    }

}
//print factorial for n: ex: 5! 5*4*3*2*1=120
package Methods;

import java.util.Scanner;

public class PicturePerfect {

    public static void main(String[] args) {

        System.out.println("select image: " +
                            "1)sunset " +
                            "2)earth " +
                            "3)desert ");

        Scanner scan = new Scanner(System.in);
        int selection = scan.nextInt();

        switch (selection){
           // case 1: print
        }
    }
}
/*
There is three defined methods: printSunset(), printEarth(), printDesert().

Write a program in the main method to ask the user which image they wish to see.

Flow:

select image:
 1)sunset
 2)earth
 3)desert
  ​
if its 1 call  printSunset() method
​
if its 2 call  printEarth() method
​
if its 3 call  printDesert() method
 */
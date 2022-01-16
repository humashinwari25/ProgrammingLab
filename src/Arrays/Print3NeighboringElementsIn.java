package Arrays;

import java.util.Scanner;

public class Print3NeighboringElementsIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = input.nextLine();
        }
        //System.out.println(arr[0] + ", " + arr[1] + ",  "+ arr[2]);
        //System.out.println(arr[1] + ", " + arr[2] + ",  "+ arr[3]);
        //System.out.println(arr[2] + ", " + arr[3] + ",  "+ arr[4]);
        //System.out.println(arr[3] + ", " + arr[4] + ",  "+ arr[5]);
        //System.out.println(arr[4] + ", " + arr[5] + ",  "+ arr[6]);
        //System.out.println(arr[5] + ", " + arr[6] + ",  "+ arr[7]);
        for (int i = 0; i < arr.length -3 ; i++) {
            System.out.println(arr[i] + ", " + arr[i + 1] + ", " + arr[i + 2]);
        }
    }
}
/*
The code provided in your main method will take in six Strings and save them into an array arr.

Print out the 3 neighboring items of the array in one line until the last line each line should contain 3 neighboring items of array element as displayed below

Example:

arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda"]
​
Output:
apple, banana, kiwi
banana, kiwi, grape
kiwi, grape, milk
grape, milk, soda
 */
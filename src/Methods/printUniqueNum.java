package Methods;

import java.util.Scanner;

public class printUniqueNum {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] nums = new int[size];
            for(int i=0; i < size; i++){
                nums[i] = scan.nextInt();
            }
            printUniqueNumbers(nums);
        }

        public static void printUniqueNumbers(int[] nums){
            //WRITE YOUR CODE HERE

            for (int i = 0; i < nums.length; i++) {

                boolean isUnique = true;
                for (int j = 0; j < nums.length; j++) {

                    if(i != j && nums[i] == nums[j]){
                        isUnique = false;
                        break;
                    }

                }
                if(isUnique)
                    System.out.println(nums[i]);
                }

            }
        }



/*
    Complete a void method printUniqueNumbers() that will print all unique numbers from an array of ints.
     Every single unique int should be printed from the new line.
        `Example:`
        `Example:`
        `input:[2, 5, 5, 6, 3, 6, 9, 34, 3]`
        `input:[2, 5, 5, 6, 3, 6, 9, 34, 3]`
        `output:`
        `output:`
        `2`
        `2`
        `9`
        `9`
        `34`

 */
package Variables;
import java.util.Scanner;
public class PhoneNum {


        public static void main(String[] args){

            //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
            // Variables are already declared and given
            Scanner scan=new Scanner(System.in);
            //System.out.println("Enter areacode:");
            int areaCode=scan.nextInt();
            // System.out.println("Enter local Number:");
            int localNumber=scan.nextInt();

            String phoneNumber = "(" + areaCode + ")-" + localNumber;
            //WRITE YOUT CODE HERE:
            System.out.println("Calling number " + phoneNumber);


        }
    }
/*
Write a program that asks user to input int values: areaCode and localNumber.

Using concatenation put together in this format and assign to String phoneNumber variable:
(222)-3334444

Write a print statement that displays (use the phoneNumber variable ):
Calling number (222)-3334444
 */
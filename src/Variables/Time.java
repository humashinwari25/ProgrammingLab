package Variables;

import java.util.*;
public class Time {

        public static void main(String[] args) {
            //1. declare your variables here:
            int hour = 12;
            int minute = 24;
            int second = 33;
            String amOrPm = "PM";


            //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES
            Scanner sc = new Scanner(System.in);
            hour   = sc.nextInt();
            minute = sc.nextInt();
            second = sc.nextInt();
            amOrPm = sc.next();
            //#############################

            //2. WRITE YOUR CODE HERE:

            System.out.println(hour + ":" + minute + ":" + second+ " " +amOrPm);




        }
    }
    /*
    In this assignment, you will write code to put together time of day.

Like this: 12:24:33 PM

Declare variables: hour, minute, second that can hold int values.

Declare amOrPm variable that can hold a String ("AM" or "PM")

Instructor will set different values to your variables

Using the variables and concatenation, print values in the format mentioned above.
     */
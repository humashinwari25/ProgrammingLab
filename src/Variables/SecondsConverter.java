package Variables;

import java.util.Scanner;

public class SecondsConverter {

    public static void main(String[] args) {
                //YOUR CODE HERE:
                Scanner scanner = new Scanner(System.in);

                //3600 seconds = 1 hour
                //3600 seconds = 60 minutes//3700 seconds = 1 hour, 1 minute and 40 seconds
                //hour : 3700/3600 = 1 hour, 100 seconds remaining
                // minutes: 100/60 = 1 minute, 40 seconds remaining
                //seconds: remaining seconds from minute calculation -->40 seconds

                int inputSeconds, hours, minutes,seconds ;
                System.out.println("Enter seconds:");
                inputSeconds = scanner.nextInt(); //3700;

                hours= inputSeconds /3600;
                int remainingSecondsAfterHour = inputSeconds % 3600 ;//100
                minutes = remainingSecondsAfterHour/60 ; //100/60=1 min.40 seconds
                seconds = remainingSecondsAfterHour % 60 ; //40

                System.out.println(hours + " hours, " + minutes + " minutes, and " +seconds + " seconds");
            }
        }

/*
Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

Create a Scanner object
Declare int variables inputSeconds, hours, minutes, seconds
Ask user enter seconds by printing:

"Enter seconds:"

Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.

Assign values to the hours, minutes, seconds variables

Display the result.

Example:

Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
 */
package Statements;

import java.util.Scanner;
public class ifStatementGrades {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int grade = s.nextInt();
            //Write your code here:

            if(grade>=90){
                System.out.println("excellent");
            }else if(grade>=70 && grade < 90){
                System.out.println("good");
            }else if(grade>60 && grade<70 ){
                System.out.println("pass");
            }else{
                System.out.println("fail");
            }
        }




    }

/*
Write a program that takes the grade int and prints if it's a passing grade or failure.

if grade is equal or greater than 90 output "excellent"
if the grade is equal or greater than 70 and less then 90 output "good"
if grade is greater than 60 and less than 70 output "pass"
if grade is lessr than 60 output "fail"
Examples:

93

excellent
93

excellent
46

fail
46

fail
80

good
 */
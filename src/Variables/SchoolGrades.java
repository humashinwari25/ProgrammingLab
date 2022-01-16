package Variables;

import java.util.Scanner;

public class SchoolGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Grader!" +"\n" +
                "Please enter subject name number 1 and score for this subject");
        String number1 = input.nextLine();
        double score1 = input.nextDouble();
        input.nextLine();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String number2 = input.nextLine();
        double score2 = input.nextDouble();
        input.nextLine();
        System.out.println("Please enter subject name number 3 and score for this subject");
        String number3 = input.nextLine();
        double score3 = input.nextDouble();
        input.nextLine();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String number4 = input.nextLine();
        double score4 = input.nextDouble();
        input.nextLine();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String number5 = input.nextLine();
        double score5 = input.nextDouble();
        input.nextLine();
        double averageGrade = (score1+score2+score3+score4+score5)/5;

        System.out.println("Summary: " + number1 + " - " + score1+", "+ number2 + "- " +
                        score2 +", "+ number3 + " - " + score3 + ", " +  number4 + " - " + score4
                + ", " + number5 + " - " + score5 +
                "\n" + "Your average score is: "+ averageGrade +
                "\n" + "Thank you for using Grader!" +
                        "\n" + "Goodbye!");
    }
}
/*
Write the program that will calculate the average grade. Use 5 String variables and 6 double variables to hold the subject and the grade value. Build a summary with all the information by concatenating the subjects and grades. Then calculate the average grade and print display the average score too.

Execution flow with example:

Welcome to the Grader!
Please enter subject name number 1 and score for this subject
Math
5.0
Please enter subject name number 2 and score for this subject
Biology
4.2
Please enter subject name number 3 and score for this subject
English
4.4
Please enter subject name number 4 and score for this subject
Chemistry
4.8
Please enter subject name number 5 and score for this subject
Music
3.4

Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8, Music - 3.4
Your average score is: 4.36
Thank you for using Grader!
Goodbye!
 */

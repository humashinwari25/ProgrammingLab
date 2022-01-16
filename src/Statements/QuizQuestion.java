package Statements;
import java.util.*;
public class QuizQuestion {

    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.println("what is the farthest planet in the solar system:" );
            System.out.println("a)venus" );
            System.out.println("b)pluto" );
            System.out.println("c)neptune" );

            String a = s.nextLine();
            String A = "a",
                    B = "b",
                    C = "c",
                    result = "";

            //your code here

            if(a.equals(A)){
                result ="a is wrong";
            }else if(a.equals(B)){
                result ="b is correct";
            }else if(a.equals(C)){
                result ="c is wrong";
            }else{
                result ="z is not a valid answer";
            }
            System.out.println(result);

        }
    }
/*
In the given program you have a quiz question and a scanner to get the user input which will be stored on string a.

after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, or invalid answer.

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

a

a is wrong
what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

a

a is wrong
what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

b

b is correct
copied!
what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

b

b is correct
what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

c

c is wrong
what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

c

c is wrong
what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

z

z is not a valid answer
 */
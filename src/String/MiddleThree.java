package String;

import java.util.Scanner;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int length = word.length();

        String middThree =
                (word.substring(word.length()/2 - 1, word.length()/2 + 2));

        boolean valid =  length >= 5 && length % 2 != 0;
        if(valid){
            System.out.println(middThree);
        }else{
            System.out.println("invalid");
        }

    }
}
/*
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //WRITE YOUR CODE HERE:

    String result ="";

    if(word.length()>5&& word.length()%2!=0){
        result= word.substring(word.length()/2-1,word.length()/2+2);

    }else{
      result = "invalid";
    }
    System.out.println(result);

  }
}

 */

/*
Given a String variable word print the middle three
characters if the word is an odd number of characters and has
more than 5 characters. If the word does not meet the requirements
print invalid.

fifteen ==> fte
fifteen ==> fte
apple ==> ppl
apple ==> ppl
hey ==> invalid
hey ==> invalid
java ==> invalid
java ==> invalid
whatsup ==> ats
whatsup ==> ats
$ ==> invalid
 */
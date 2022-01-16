package Statements;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int giftCard = 100;
        String item = input.nextLine();

        if (item.equals("Blanket")) {
            System.out.println("Thank you for your purchase!" + "\n" + "Your current balance is: " + (giftCard - 60) + "$");
        } else if (item.equals("Charger")) {
            System.out.println("Thank you for your purchase!" + "\n" + "Your current balance is: " + (giftCard - 15) + "$");
        } else if (item.equals("Hat")) {
            System.out.println("Thank you for your purchase!" + "\n" + "Your current balance is: " + (giftCard - 25) + "$");
        } else if (item.equals("Headphones")) {
            System.out.println("Thank you for your purchase!" + "\n" + "Your current balance is: " + (giftCard - 30) + "$");
        } else if (item.equals("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("Pants")) {
            System.out.println("Thank you for your purchase!" + "\n" + "Your current balance is: " + (giftCard - 50) + "$");
        } else if (item.equals("Pillow")) {
            System.out.println("Thank you for your purchase!" + "\n" + "Your current balance is: " + (giftCard - 40) + "$");
        } else if (item.equals("Socks")) {
            System.out.println("Thank you for your purchase!" + "\n" + "Your current balance is: " + (giftCard - 5) + "$");
        } else if (item.equals("USB cable")) {
            System.out.println("Thank you for your purchase!" + "\n" + "Your current balance is: " + (giftCard - 10) + "$");
        } else if (item.equals("Smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else {
            System.out.println("Invalid item!");
        }
    }
}



/*
Similar to Vending Machine
Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase.

If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
List of items Blanket - 60$ Charger - 15$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$

Hint: if/ else if / else or switch statement

Examples:

input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
input: Laptop
Output:
Sorry, not enough funds on your gift card!
input: Laptop
Output:
Sorry, not enough funds on your gift card!
input: Cupcake
output: Invalid item!
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardtrick;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * 
 * @author Roshan
 */
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        Card luckyCard = new Card();
        luckyCard.setSuit("Spade");
        luckyCard.setValue(7);
        
        Random rand = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            // c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(13) + 1);
            // c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter card value (1-13):");
        int userValue = scanner.nextInt();

        System.out.println("Enter card suit (Hearts, Diamonds, Clubs, Spades):");
        String userSuit = scanner.next();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        // insert code to ask the user for Card value and suit, create their card
        // and search magicHand here

        // Then report the result here
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Report the result
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
            System.out.println("Magic Cards in Hand are:");

            for (int i = 0; i < magicHand.length; i++) {

                System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuit());
            }
        }
    }

}

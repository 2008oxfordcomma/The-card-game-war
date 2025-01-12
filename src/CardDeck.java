/**
* Class: CardDeck.java
* Author: Dre Harm
* Date: Jan 12, 2025
* Assignment: CardGame-War
* Goals:
* a)
* b)
* Inputs:
* Outputs:
* Packages:
* Algorithms:
*
*/

import java.util.ArrayList;

/**
 * 
 */
public class CardDeck {
	
	Card[] cards;

	/**
	 * 
	 */
	public CardDeck() {
	
	}
	
	public Card[] createDeckOfCards() {
		cards = new Card[52];
		
		String[] suitOptions = {"Spade", "Heart", "Club", "Diamond"};
		String[] numberOptions = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		// Create Spade Suit
		for (int i = 0; i < 13; i++) {
			cards[i] = new Card(suitOptions[0], numberOptions[i]);
		}
		
		// Create Heart Suit
		for (int i = 0; i < 13; i++) {
				cards[i + 13] = new Card(suitOptions[1], numberOptions[i]);
		}
		
		// Create Club Suit
		for (int i = 0; i < 13; i++) {
				cards[i + 26] = new Card(suitOptions[2], numberOptions[i]);
		}
		
		// Create Diamond Suit
		for (int i = 0; i < 13; i++) {
				cards[i + 39] = new Card(suitOptions[3], numberOptions[i]);
		}
		
		return cards;
	}
	
	public void print() {
		for (Card xCard : cards) {
			System.out.println(xCard.getNumber() + " of " + xCard.getSuit());
		}
	}
	
	public void deal(Player player01, Player player02) {
		for (int i = 0; i < 52; i += 2) {
			player01.setHand(cards[i]);
		}
		
		for (int i = 1; i < 52; i += 2) {
			player02.setHand(cards[i]);
		}
	}
	
}

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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 */
public class CardDeck {
	
	Card[] cards;
	Card[] shuffledCards;

	/**
	 * 
	 */
	public CardDeck() {
	
	}
	
	public Card[] createDeckOfCardsSorted() {
		cards = new Card[52];
		
		String[] suitOptions = {"Spade", "Heart", "Club", "Diamond"};
		String[] numberOptions = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		// Create Spade Suit
		for (int i = 0; i < 13; i++) {
			cards[i] = new Card(numberOptions[i], suitOptions[0]);
		}
		
		// Create Heart Suit
		for (int i = 0; i < 13; i++) {
				cards[i + 13] = new Card(numberOptions[i], suitOptions[1]);
		}
		
		// Create Club Suit
		for (int i = 0; i < 13; i++) {
				cards[i + 26] = new Card(numberOptions[i], suitOptions[2]);
		}
		
		// Create Diamond Suit
		for (int i = 0; i < 13; i++) {
				cards[i + 39] = new Card(numberOptions[i], suitOptions[3]);
		}
		
		return cards;
	}
	
	/**
	 * @return An array of unsorted cards
	 */
	public Card[] getCards() {
		return cards;
	}
	
	public void print() {
		for (Card xCard : cards) {
			System.out.println(xCard.getNumber() + " of " + xCard.getSuit());
		}
	}
	
	public void deal(Player player01, Player player02) {
		for (int i = 0; i < 52; i += 2) {
			player01.setHand(shuffledCards[i]);
		}
		
		for (int i = 1; i < 52; i += 2) {
			player02.setHand(shuffledCards[i]);
		}
	}
	
	public void shuffle(Card[] cardArray) {
		List<Card>cardList = Arrays.asList(cardArray);
		Collections.shuffle(cardList);
		shuffledCards = cardList.toArray(cardArray);
	}
	
}

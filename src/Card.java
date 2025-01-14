/**
* Class: Card.java
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

/**
 * 
 */
public class Card {
	
	int number;
	String suit;
	
	public Card(int number, String suit) {
		this.number = number;
		this.suit = suit;
		
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public String print() {
		return "Number: " + getNumber() + ", Suit: " + getSuit();
	}
}

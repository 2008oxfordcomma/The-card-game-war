/**
* Class: Player.java
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
public class Player {
	
	private ArrayList<Card> hand = new ArrayList<Card>();
	String name;
	
	Player(String name) {
		this.name = name;
	}
	
	public void setHand(Card card) {
		hand.add(card);
	}
	
	public void showHand() {
		System.out.println(name + "'s hand: ");
		for (Card card : hand) {
			System.out.println(card.print());
		}
	}

}

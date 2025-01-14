/**
* Class: GameOperations.java
* Author: Dre Harm
* Date: Jan 13, 2025
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

import javax.lang.model.type.IntersectionType;
import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * 
 */
public class GameOperations {
	
	ArrayList<Card> player01Hand, player02Hand;
	Player player01;
	Player player02;
	

	GameOperations(Player player01, Player player02) {
		this.player01 = player01;
		this.player02 = player02;
		this.player01Hand = player01.getHand();
		this.player02Hand = player02.getHand();
	}
	
	public void runGame() {
		while(!player01.getHand().isEmpty() || !player02.getHand().isEmpty()) {
			if (player01.getHand().size() > player02.getHand().size()) { // finding whoever has the least amount of cards
				for (int i = 0; i < player02.getHand().size(); i++) { // condition: player02 has the lower amount of cards
					
				}
			} else {
				for (int i = 0; i < player01.getHand().size(); i++) { // condition: player01 has the lower amount of cards
					
				}
			}
			
		}
	}
	
	public boolean testForLargerCard(Card player01Card, Card player02Card) {
		String p1CardNum = .getNumber();
		boolean result = true;
		return result;
	}
	
}

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
	
	ArrayList<Card> player01OffHand = new ArrayList<Card>(); 
	ArrayList<Card> player02OffHand = new ArrayList<Card>();
	

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
					if (!atWar(player01Hand.get(i), player02Hand.get(i)) ) {
						testForLargerCard(player01Hand.get(i), player02Hand.get(i));
						player01Hand.remove(i);
						player02Hand.remove(i);
					} else {
						runAtWarScenerio();
					}
				}
			} else {
				for (int i = 0; i < player01.getHand().size(); i++) { // condition: player01 has the lower amount of cards
					if (!atWar(player01Hand.get(i), player02Hand.get(i)) ) {
						testForLargerCard(player01Hand.get(i), player02Hand.get(i));
						player01Hand.remove(i);
						player02Hand.remove(i);
					} else {
						runAtWarScenerio();
					}
				}
			}
			
		}
		player01Hand.addAll(player01OffHand);
		player01OffHand.removeAll(player01OffHand);
		player02Hand.addAll(player02OffHand);
		player02OffHand.removeAll(player02OffHand);
	}
	
	public boolean atWar(Card player01Card, Card player02Card) {
		if (player01Card == player02Card) {
			System.out.println(" - Went to war - Player 1: " + player01Card.getNumber() + ", Player 2: " + player02Card.getNumber());
			return true;
		} else {
			return false;
		}
	}
	
	private void runAtWarScenerio() {
		
		// 4 cards needed, 3 go to the war pile, 1 goes towards seeing who wins
		if (player01Hand.size() <= 4 || player02Hand.size() <= 4) {
			// shuffle offHand and add to hand
		}
		
		ArrayList<Card> warPile = new ArrayList<Card>();
		
		for (int i = 0; i < 3; i++) {
			warPile.add(player01Hand.getFirst());
			warPile.add(player02Hand.getFirst());
			player01Hand.removeFirst();
			player02Hand.removeFirst();
		}
		
		if (player01Hand.getFirst().getNumber() > player02Hand.getFirst()) {
			
		}
		
		
		
	}
	
	private void testForLargerCard(Card player01Card, Card player02Card) {
		int p1CardNum = player01Card.getNumber();
		int p2CardNum = player02Card.getNumber();
		
		if (p1CardNum == 1) { // Ace Scenario player 1
			System.out.println("Player 1 Won Round with Ace: Player 1 Card -> " +  p1CardNum + ", Player 2 Card -> " + p2CardNum);
			player01OffHand.add(player01Card);
			player01OffHand.add(player02Card);
		} else if (p2CardNum == 1) { // Ace Scenario player 2
			System.out.println("Player 2 Won Round with Ace: Player 1 Card -> " +  p1CardNum + ", Player 2 Card -> " + p2CardNum);
			player02OffHand.add(player01Card);
			player02OffHand.add(player02Card);
		} else if (p1CardNum > p2CardNum) { // Player 1 win
			System.out.println("Player 1 Won Round: Player 1 Card -> " +  p1CardNum + ", Player 2 Card -> " + p2CardNum);
			player01OffHand.add(player01Card);
			player01OffHand.add(player02Card);
		} else if (p1CardNum < p2CardNum) { // player 2 win
			System.out.println("Player 2 Won Round: Player 1 Card -> " +  p1CardNum + ", Player 2 Card -> " + p2CardNum);
			player02OffHand.add(player01Card);
			player02OffHand.add(player02Card);
		} else {
			System.out.println("Error in case: Player 1 Card -> " +  p1CardNum + ", Player 2 Card -> " + p2CardNum);
			System.out.println("- ERROR - You should not be seeing this!!");
		}
	}
	
}

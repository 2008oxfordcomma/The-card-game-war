/**
* Class: Main.java
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
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		
		deck.createDeckOfCardsSorted();
		deck.shuffle(deck.getCards());
		
		Player player01 = new Player("Dre");
		Player player02 = new Player("Nico");
		
		GameOperations game = new GameOperations(player01, player02);
		
		deck.deal(player01, player02);
		
		game.runGame();
		
		System.out.println("Hand amount: " + player01.getHandAmount());
		player01.showHand();
		System.out.println();
		System.out.println("Hand amount: " + player02.getHandAmount());
		player02.showHand();
		
		
	}

}

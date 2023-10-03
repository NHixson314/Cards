import java.util.Arrays;
/**
 * This method test the Deck class
 * @author Nora Hixson
 */
public class TestingDecks {

	public static void main(String[] args) {
		
		Deck deck1 = new Deck();
		System.out.println("Deck 1: " + deck1.toString());
		
		Deck deck2 = new Deck(false);
		
		Deck deck3 = new Deck(deck1);
		System.out.println("Deck 3: " + deck3.toString());
		
		System.out.println("deck 4 = deck 1 should be true: " + deck3.equals(deck1));
		
		Deck deck4 = new Deck(32);
		
		System.out.print("Deck 4 length: " + deck4.getTopCard());
		
		deck1.war();
		
		//System.out.println("Pick from deck 2:" + deck2.pick());
		//System.out.println("Deck 2 without card:" + deck2.toString());
		Deck deck5 = new Deck();
		
		System.out.println("Deck 5 pick: " + deck5.pick());
		System.out.println("Deck after pick" + deck5.toString());
		 
		Deck deck6 = new Deck();
		deck6.shuffle();
		Arrays.sort(deck6.deck,new CompareRankNSuit());
		
		Deck deck7 = new Deck();
		deck7.shuffle();
		deck7.selectionSort();
		
		
		Deck deck8 = new Deck();
		deck8.shuffle();
		deck8.mergeSort();// merge sort does not work
		
		///System.out.println("Selection Sort works: " + deck7.equals(deck6));
		System.out.println("Merge works: " + deck8.equals(deck6));
		//System.out.println("Deck7: " + deck7.toString());
		System.out.println("Deck6: " + deck6.toString());
		System.out.println("Deck8: " + deck8.toString());
		

	}

}

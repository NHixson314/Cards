/**
 * This Class tests the Card Class
 * @author Nora Hixson
 */
public class TestingCards {

	public static void main(String[] args) {
		Card card1 = new Card();
		System.out.println("Card 1: " + card1.toString());
		
		Card card2 = new Card(2,6);
		System.out.println("Card 2 : " + card2.toString());
		
		//Card card3 = new Card("Diamonds", "Twelve");
		Card card3 = new Card("Diamonds", "Eight"); 
		System.out.println("Card 3 : " + card3.toString());
		
		Card card4 = new Card("Clubs", 13); 
		System.out.println("Card 4 : " + card4.toString());
		
		Card card5 = new Card( 0, "Five"); 
		System.out.println("Card 5: " + card5.toString());
		
		Card card6 = new Card(card2);
		System.out.println("Card 6 : " + card6.toString());
		
		System.out.println("Card 3 Suit: " + card3.getSuit());
		
		System.out.println("Card 5 Rank " + card5.getRank());
		
		Card card7 = new Card(0,"King");
		System.out.println("Card 7 : " + card7.toString());
		
		System.out.println("Card 7 == Card 4: " + card4.equals(card7));
		
		System.out.println("Comapre Card 5 to Card 4 should be -1: " + card5.compareTo(card4));

	}

}

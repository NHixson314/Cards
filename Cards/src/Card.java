/**
 * @Author Nora Hixson
 *  
 */
public class Card {
	
// Fields
	private String Suit;
	private int Rank;
	
// Constructors
	
	Card(){
		Rank = 1;
		Suit = "Ace";
	}
	
	Card(int suit, int rank){
		Rank = rank;
		//Suit = suitIntString(suit);
	}
	
	Card(String suit, String rank){
		Suit = suit;
		//Rank = rankStringInt(rank);
	}
	
	Card(String suit,int rank){
		Suit = suit;
		Rank = rank;
	}
	
	Card(int suit, String rank){
		// Suit = suitIntStrins(suit);
		// Rank = rankStringInt(rank);
	}
	
	Card(Card other){
		Suit = other.getSuit();
		Rank = other.getRank();
	}
	
	//Getters
	
	public String getSuit(){
		return Suit; 
	}
	
	public int getRank(){
		return Rank;
	}
	
	// ToStrings and Converters 
	
	public String toString() {
		return getRankString() + " of " + Suit;
	}
	
	public String getRankString(){
		
		switch(Rank) {
			case 1:
				return "Ace";
				break;
			case 2:
				return "Two";
				break;
			case 3:
				return "Three";
				break;
			case 4:
				return "Four";
				break;
			case 5:
				return "Five";
				break;
			case 6:
				return "Six";
				break;
			case 7:
				return "Seven";
				break;
			case 8:
				return "Eight";
				break;
			case 9:
				return "Nine";
				break;
			case 10:
				return "Ten";
				break;
			case 11:
				return "Jack";
				break;
			case 12:
				return "Queen";
				break;
			case 13:
				return "King";
				break;
			
		}
		return null;
	}
	
	public int getSuitInt(){
		switch(Suit){
			case "Clubs":
				return 0;
				break;
			case "Diamonds":
				return 1;
				break;
			case "Hearts":
				return 2;
				break;
			case "Spades":
				return 3;
				break;
		}
		return -1;
	}
	
	public static void main(String []args){
		
	}
	
	
	
}

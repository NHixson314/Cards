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
		
		return rankIntString(Rank);
	}
	
	public int getSuitInt(){
		switch(Suit){
			case "Clubs":
				return 0;
		
			case "Diamonds":
				return 1;
			
			case "Hearts":
				return 2;
			
			case "Spades":
				return 3;
			
		}
		return -1;
	}
	
	private String suitIntStr(int suit){
		switch(suit){
			case 0:
				return "Clubs";
			
			case 1:
				return "Diamonds";
				
			case 2:
				return "Hearts";
			
			case 3:
				return "Spades";
				
		}
		
		System.out.println("Invaild suit name");
		return null;
	}
	
	public String rankIntString(int rank){
			switch(rank) {
				case 1:
					return "Ace";
					
				case 2:
					return "Two";
					
				case 3:
					return "Three";
				
				case 4:
					return "Four";
					
				case 5:
					return "Five";
					
				case 6:
					return "Six";
				
				case 7:
					return "Seven";
			
				case 8:
					return "Eight";
				
				case 9:
					return "Nine";
				
				case 10:
					return "Ten";
				
				case 11:
					return "Jack";
		
				case 12:
					return "Queen";
			
				case 13:
					return "King";
			
				
			}
			return null;
		}
	
	public int rankStrInt(String s) {
		switch(s){
		case "Ace":
			return 1;

		case "Two":
			return 2;
	
		case "Three":
			return 3;
	
		case "Four":
			return 4;
	
		case "Five":
			return 5;
		
		case "Six":
			return 6;

		case "Seven":
			return 7;

		case "Eight":
			return 8;
	
		case "Nine":
			return 9;

		case "Ten":
			return 10;

		case "Jack":
			return  11;
	
		case "Queen":
			return 12;
	
		case "King":
			return 13;
	
		}
		
		System.out.println();
		return -1;
	}
	
	public boolean equals(Object other){
		if(other instanceof Card) {
			if(this.getRank() == ((Card) other).getRank() && this.getSuit() == ((Card) other).getSuit())
				return true;
		}
		return false;
	}
	
	public int compareTo(Card other){
		if(this.Rank > other.getRank())
			return 1; 
		if(this.Rank < other.getRank())
			return -1;
		if(this.getSuitInt() > other.getSuitInt())
			return 1;
		if(this.getSuitInt() < other.getSuitInt())
			return -1;
		
		return 0;
	}
	
	
	public static void main(String []args){
		System.out.println("Testing yo");
	}
	
	
	
}

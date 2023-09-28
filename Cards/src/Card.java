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
	
	private String suitIntStr(suit){
		switch(suit){
			case 0:
				return "Clubs";
				break;
			case 1:
				return "Diamonds";
				break;
			case 2:
				return "Hearts";
				break;
			case 3:
				return Spades;
				break;
		}
		
		System.out.println("Invaild suit name");
		return null;
	}
	
	public String rankIntString(int rank){
			switch(rank) {
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
	
	public int rankStrInt(String s) {
		switch(s){
		case "Ace":
			return 1;
			break;
		case "Two":
			return 2;
			break;
		case "Three":
			return 3;
			break;
		case "Four":
			return 4;
			break;
		case "Five":
			return 5;
			break;
		case "Six":
			return 6;
			break;
		case "Seven":
			return 7;
			break;
		case "Eight":
			return 8;
			break;
		case "Nine":
			return 9;
			break;
		case "Ten":
			return 10;
			break;
		case "Jack":
			return  11;
			break;
		case "Queen":
			return 12;
			break;
		case "King":
			return 13;
			break;
		}
		
		System.out.println();
		return -1;
	}
	
	public boolean equals(Object other){
		if(other instanceof Card) {
			if(this.getRank() == other.getRank() && this.getSuit() == other.getSuit())
				return true;
		}
		return false;
	}
	
	
	
	public static void main(String []args){
		
	}
	
	
	
}

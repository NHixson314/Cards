/**
 * @Author Nora Hixson
 *  This class creates a card
 */
public class Card implements Comparable<Card>{
	
// Fields
	private String Suit;
	private int Rank;
	
// Constructors
	
	/**
	 * No parameter constructor makes Ace of Spades
	 */
	
	Card(){
		Rank = 1;
		Suit = "Spades";
	}
	
	/**
	 * Card constructor
	 * @param suit int
	 * @param rank int
	 */
	
	Card(int suit, int rank){
		Rank = rank;
		Suit = suitIntStr(suit);
	}
	
	/**
	 * Card Constructor
	 * @param suit String
	 * @param rank String
	 */
	
	Card(String suit, String rank){
		Suit = suit;
		Rank = rankStrInt(rank);
	}
	
	/**
	 * Card Constructor
	 * @param suit String
	 * @param rank int
	 */
	Card(String suit,int rank){
		Suit = suit;
		Rank = rank;
	}
	
	/**
	 * Card Constructor
	 * @param suit int
	 * @param rank String
	 */
	Card(int suit, String rank){
		Suit = suitIntStr(suit);
		Rank = rankStrInt(rank);
	}
	
	/**
	 * Card Constructor
	 * @param other Card
	 */
	Card(Card other){
		Suit = other.getSuit();
		Rank = other.getRank();
	}
	
	//Getters
	
	/**
	 * getSuit
	 * @return String
	 */
	
	public String getSuit(){
		return Suit; 
	}
	
	/**
	 * getRank
	 * @return int
	 */
	
	public int getRank(){
		return Rank;
	}
	
	// ToStrings and Converters
	
	
	/**
	 * toString
	 * @return String
	 */
	
	@Override
	
	public String toString() {
		return getRankString() + " of " + Suit;
	}
	
	/**
	 * getRankString
	 * takes the int rank and converts it to the  string
	 * @return String
	 */
	
	public String getRankString(){
		
		return rankIntString(Rank);
	}
	
	/**
	 * getSuitInt
	 * takes the suit string and makes it an int
	 * @return int
	 */
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
	/**
	 * takes in a parameter int suit and makes it a string
	 * @param suit int
	 * @return String
	 */
	
	public String suitIntStr(int suit){
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
		
		System.out.println("Invaild suit number");
		return null;
	}
	
	/**
	 * rankIntString takes in parameter rank and makes it a string
	 * @param rank int
	 * @return String
	 */
	
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
	
	/**
	 * rankStrInt takes in rank as a s and returns an int
	 * @param s
	 * @return int
	 */
	
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
	
	
	/**
	 * equals compares whether this and object of type Card are equal
	 * @param other Object
	 * @return boolean
	 */
	
	@Override
	public boolean equals(Object other){
		if(other instanceof Card) {
			if(this.getRank() == ((Card) other).getRank() && this.getSuit() == ((Card) other).getSuit())
				return true;
		}
		return false;
	}
	
	/**
	 * compareTo compares this and a Card to see which is greater
	 * @param other Card
	 * @return int
	 */
	
	@Override
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

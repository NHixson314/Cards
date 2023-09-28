/**
 * @author Nora Hixson
 */

public class Deck {
	
// Fields 
	Card[] deck;
	int TopCard;
	Card[] temp;
	
// Constructors
	
	public Deck(){
		deck = new Card[52];
		int curr = 0;
		for(int i = 0; i < 13; i++) {
			for(int j = 0; j < 3; j++){
				deck[curr] = new Card(j,i);
				curr++;
			}
				
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Deck works yo");
	}

}

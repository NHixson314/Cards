/**
 * @author Nora Hixson
 * The purpose of this class is to create a sort a deck
 */

public class Deck {
	
// Fields 
	Card[] deck;
	int TopCard;
	Card[] temp;
	Card c = new Card();
// Constructors
	
	/**
	 * Deck constructor
	 */
	public Deck(){
		deck = new Card[52];
		TopCard = 51;
		int curr = 0;
		for(int i = 1; i <= 13; i++) {
			for(int j = 0; j <= 3; j++){
				deck[curr] = new Card(j,i);
				curr++;
			}		
		}
	}
	
	/**
	 * Takes in a boolean of whether of not the array is sorted
	 * @param sort boolean
	 */
	
	public Deck(boolean sort){
		TopCard = 51;
		if(sort == true) {
			Deck d = new Deck();
			deck = d.deck;
		}else{
			Deck d = new Deck();
			deck = d.deck;
			shuffle();
		}
	}
	
	/**
	 * Copy constructor
	 * @param other Deck
	 */
	public Deck(Deck other){
		TopCard = 51;
		Deck d = new Deck();
		deck = d.deck;
		int curr = 0;
		for(Card card : other.deck) {
			this.deck[curr] = card;
			curr ++;
		}
	}
	
	/**
	 * Takes in an int and makes a deck of that length
	 * @param cards int
	 */
	public Deck(int cards){
		deck = new Card[cards];
		TopCard = cards -1;
	}
	
	// Methods
	/**
	 * Randomly swaps half the elements in an array.
	 */
	
	public void shuffle(){
		System.out.println("shuffle was called");
		int shuffleNum = TopCard/2;
		System.out.println("shuffle num: " + shuffleNum);
		for(int i = 0; i < shuffleNum; i++){
			int ran1 = (int)(Math.random() * TopCard);
			System.out.println("This is ran 1 : " + deck[ran1]);
			Card placeholder = deck[ran1];
			System.out.println("this is the placeholder" + placeholder);
			int ran2 = (int)(Math.random() * TopCard);
			System.out.println("This is ran2: " + deck[ran2]);
			deck[ran1] = deck[ran2];
			System.out.println("This is new ran 1: " + deck[ran1]);
			deck[ran2] = placeholder;		
			System.out.println("This is new ran2: " + deck[ran2]);
			
		}
	}
	
	// toString
	
	/**
	 * basic toString method
	 * @return String
	 */
	
	@Override 
	
	public String toString(){
		String str = "";
		if(TopCard == 52){
			for(int suit = 0; suit < 4; suit ++){
				System.out.println();
				String s = c.suitIntStr(suit);
				
				for(int rank = 1; rank < 13; rank ++){
					System.out.print( c.rankIntString(rank)  + " of " +s+ ", ");
					str +=  c.rankIntString(rank) + "of" + s + ", ";
				}
			}
		}else{
			int curr = 0;
			for(Card card: this.deck){
				str += curr + card.toString();
				System.out.println((curr + 1)+ ". " + card.toString());
				curr++;
			}
		}
		
		
		return str;
	}
	
	/**
	 * checks to see if deck is equal to another deck
	 * @param other Object
	 * @return boolean 
	 */
	
	@Override
	
	public boolean equals(Object other){
		
		if(other instanceof Deck){
			
			if(deck.length == ((Deck)other).deck.length) {
				for(int i = deck.length-1; i > 0; i--){
					int comp = deck[i].compareTo(((Deck)other).deck[i]);
					if(comp == 1 || comp == -1)
						return false;
				}
					return true;
			}
		}
		
		return false;
	}
	
	// special methods
	
	/**
	 * makes an array of decks by dividing the number of cards in a hand to the numbers of hands 
	 * @param hands int
	 * @param cardsPerHand int
	 * @return Deck[]
	 */
	
	public Deck[] deal(int hands, int cardsPerHand){
		shuffle();
		Deck[] decks = new Deck[hands];
		
		if(TopCard + 1 >= hands * cardsPerHand ){
			
			for(int i = 0; i <= hands-1; i++){
				decks[i] = new Deck(cardsPerHand);
				Deck currhand = decks[i];
				for(int j = cardsPerHand-1; j > 0; j--){
					currhand.deck[j] = deck[TopCard-1];
					TopCard--;
				}	
			}
			return decks;
		}
		
		return null;
		
		
	}
	
	/**
	 * takes a random card from an array and removes it, return the card
	 * @return Card
	 */
	
	public Card pick(){
		int ran = (int)(Math.random() * TopCard);
		System.out.println("random" + ran);
		Card card = deck[ran];
		
		for(int i = ran; i < TopCard; i++){
			deck[i] = new Card(deck[i + 1]);
		}
		
		TopCard = TopCard-1;
		return card;
	}
	
// Selection Sort
	
	/**
	 * sorts deck
	 */
	public void selectionSort(){
		for(int i = TopCard; i > 0; i--){
			int iMax = 0;
			
			for(int j = 1; j < i; j++ ){
				if(deck[j].compareTo(deck[iMax]) == 1)
					iMax = j;	
			} 
			
			Card temp = deck[iMax];
			deck[iMax] = deck[i-1];
			deck[i -1] = temp;
		}
	}
	
// Merge Sort
	
	/**
	 * sorts deck
	 */
	
	public void mergeSort(){
		int n = TopCard;
		temp = new Card[TopCard+1];
		curse(deck,0,n);
	}
	
	/**
	 * recursive part of mergesort
	 * @param a Card[]
	 * @param from int
	 * @param to int
	 */
	
	public void curse(Card[] a, int from, int to){
		if(to - from < 2){
			if(to > from && a[to].compareTo(a[from])== -1){
				Card tempC = new Card (a[to]);
				a[to] = new Card(a[from]);
				a[from] = tempC;
			
			}
		}else{// to variable appears to stay the same for each curse idk why
			int mid = (from + to) /2;
			curse(a,from,mid);
			curse(a,mid+1,to);
			merge(a,from,mid,to);
		}
	}
	
	/**
	 * merges all cards together
	 * @param a Card[]
	 * @param from int
	 * @param mid int
	 * @param to int
	 */
	public void merge(Card[] a, int from, int mid, int to){
		int i = from, j = mid+1, k = from;
		
		while (i <= mid && j <= to){
			System.out.println("a[i]: " + a[i]);
			System.out.println("in 1st while loop");
			if(a[i].compareTo(a[j]) == -1){
				temp[k] = new Card(a[i]);
				i++;
			}else{
				temp[k] = new Card(a[j]);
				j++;
			}
			
			k++;
		}
		
		System.out.println("first while loop done");
		
		while(i <= mid){
			System.out.println("in 2nd while loop");
			temp[k] = new Card(a[i]);
			i++;
			j++;
		}
		
		System.out.println("2nd while loop done");
		while(j <= to){
			System.out.println("in 3rd while loop");
			temp[k] = new Card(a[j]);
			j++;
			k++;
		}
		
		for(k = from; k <= to; k++) {
			System.out.println("in 4th while loop");
			a[k] = new Card(temp[k]);
		}
		System.out.println("4th while loop done");
		
	}
	
	/**
	 * gets the TopCard
	 * @return int
	 */
	
	public int getTopCard(){
		return TopCard;
	}
	
	/**
	 * sets the top card
	 * @param set int
	 */
	public void setTopCard(int set){
		TopCard = set;
	}
	
	/**
	 * Plays a game of war between two players
	 */
	public void war(){
		Deck[] a = new Deck[2];
		a = deal(2,26);
		a[0] = new Deck(a[0]);// makes it 52 in length
		a[1] = new Deck(a[1]);
		round(a[0], a[1]);
	}
	/**
	 * recursive algorithm to play war
	 * @param deck1 Deck
	 * @param deck2 Deck
	 */
	
	private void round(Deck deck1,Deck deck2){
		System.out.println("Player 1 Card: " + deck1.getTopCard() + "Player 2 Card: "+ deck2.getTopCard());
		
		if(deck1.deck[deck1.getTopCard()].compareTo(deck2.deck[deck2.getTopCard()])== 1){
			System.out.println("Player 1 won this round");
			for(int i = deck1.getTopCard()+ 1; i > 1; i--){
				deck1.deck[i] = deck1.deck[i-1];
			}
				deck1.deck[0] = deck2.deck[deck1.getTopCard()];
				deck2.deck[deck2.getTopCard()] = null;
				deck2.setTopCard(TopCard -1);
		} else{
			
			System.out.println("Player 2 won this round");
			for(int i = deck2.getTopCard()-1; i > 1; i--){
				deck2.deck[i] = deck2.deck[i-1];
			}
				deck2.deck[0] = deck1.deck[deck1.getTopCard()];
				deck1.deck[deck1.getTopCard()] = null;
				deck1.setTopCard(TopCard -1);
		}
		
		if(deck1.getTopCard() > 0 && deck2.getTopCard() > 0) {
			
			round(deck1,deck2);
		} else{
			if(deck1.getTopCard() > 0) {
				System.out.println("Player 1 won War");
			}else{
				System.out.println("Player 2 won War");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Deck works yo");
	}

}

import java.util.Comparator;

/**
 * This class is used to test the sorts
 * @ Author Nora Hixson
 */
public class CompareRankNSuit implements Comparator<Card> {
	
	/**
	 * @return int
	 * @param o1 Card
	 * @param o2 Card
	 */

	@Override
	public int compare(Card o1, Card o2) {
		
		return o1.compareTo(o2);

	}

}

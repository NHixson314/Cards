import java.util.Comparator;
/**
 *  This class is used to test the sorts
 * @author Nora Hixson
 */
public class CompareRank implements Comparator<Card>{
	
	/**
	 * @return int
	 * @param o1 Card
	 * @param o2 Card
	 */

	@Override
	public int compare(Card o1, Card o2) {
		if(o1.getRank() > o2.getRank())
			return 1; 
		if(o1.getRank() < o2.getRank())
			return -1;

		return 0;
	}

}

/*
 * JD Baudean
 * Week 3 discussion
 * CMIS242 OL 4
 */

public class Max {

	public static Comparable max(Comparable comparable1, Comparable comparable2) {
		if (comparable1.compareTo(comparable2) > 0)
			return comparable1;
		else 
			return comparable2;
	}
}

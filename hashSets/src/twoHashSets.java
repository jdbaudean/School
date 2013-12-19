import java.util.HashSet;
import java.util.Set;


public class twoHashSets {
	private Set<String>  firstHash = new HashSet<String>();
	private Set<String>  secondHash = new HashSet<String>();
	private Set<String> unionHash = new HashSet<String>();
	
	twoHashSets() {
		this.setFirstHash();
		this.setSecondHash();
		this.setUnionHash(firstHash, secondHash);
	}
	
	
	public void setFirstHash() {
		firstHash.add("George");
		firstHash.add("Jim");
		firstHash.add("John");
		firstHash.add("Blake");
		firstHash.add("Kevin");
		firstHash.add("Michael");
	}
		
	public void setSecondHash() {
		secondHash.add("George");
		secondHash.add("Katie");
		secondHash.add("Kevin");
		secondHash.add("Michelle");
		secondHash.add("Ryan");
	}
	
	public void setUnionHash(Set<String> hashOne, Set<String> hashTwo) {
		unionHash.addAll(hashOne);
		unionHash.addAll(hashTwo);
	}
	
	public Set<String> getFirstHash() {
		return firstHash;
	}
	public Set<String> getSecondHash() {
		return secondHash;
	}
	public Set<String> getUnionHash() {
		return unionHash;
	}
	/*
	public Set<String> populateHashSet(Set<String> hash) {
		
		
	}
	*/

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		twoHashSets hashSetTest = new twoHashSets();
		System.out.println("first hash " + hashSetTest.getFirstHash());
		System.out.println("second hash " + hashSetTest.getSecondHash());
		System.out.println("union hash " + hashSetTest.getUnionHash());
		// TODO Auto-generated method stub

	}

}

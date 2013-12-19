import java.lang.StringBuilder;

public class JDBaudeanp3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}

class Guitar {
	private int numStrings = 6;
	private String[] strings = {"E", "A", "D", "G", "B", "E"};
	private boolean tuned;
	private boolean isPlaying;
	public StringBuilder status = new StringBuilder();
	
	
	
	Guitar() {
		tuned = false;
		isPlaying = false;
		
	}
	
	void tune() {
		tuned = true;
		for (int i = 0; i < strings.length; i++)
			System.out.println("Tuning string " + strings[i]);
	}
	
	void startPlaying() {
		isPlaying = true;
		if (tuned == false) 
			System.out.println("The guitar is playing out of tune");
		else
			System.out.println("The guitar is playing in tune");
	}
	
	void stopPlaying() {
		isPlaying = false;
		System.out.println("The guitar has stopped playing");
	}
	
	boolean checkPlaying() {
		if (isPlaying == true)
			return true;
		else return false;
	}
	
	boolean checkTuned() {
		if (tuned == true)
			return true;
		else return false;
	}
	
	StringBuilder checkStatus() {
		status.append("Your guitar has " + Integer.toString(numStrings) + " strings.");
		status.append("\n");
		
		if (tuned == true)
			status.append("Your guitar is tuned.");
		else status.append("Your guitar is not tuned.");
		status.append("\n");
		
		if (isPlaying == true)
			status.append("Your guitar is playing.");
		else status.append("Your guitar is not playing.");	
		status.append("\n");
		
		status.append("The strings on your guitar are ");
		for (int i = 0; i < strings.length; i++) {
			status.append(strings[i] + ' ');
		}
		status.append("\n");
		
		return status;
		
	}
	
	
}
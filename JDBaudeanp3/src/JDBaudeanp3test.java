import java.io.*;

public class JDBaudeanp3test {
	
	public static void main(String[] args) {
		
		String outputFile;
		
		if (args.length == 1)
			outputFile = args[0];
		else
			outputFile = "/tmp/JDBaudeanp3test.txt";
		
		for (int i = 0; i < 10; i++) {
			
		}
		
		//Declare and create an array of Guitar objects
		Guitar[] guitarArray;
		guitarArray = createGuitarArray();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Now using guitar " + i);
			guitarArray[i].tune();
			guitarArray[i].startPlaying();
			System.out.println(guitarArray[i].checkStatus().toString());
			guitarArray[i].stopPlaying();
			System.out.println();
		}
		
		
		Guitar guitar1;
		guitar1 = new Guitar();
		guitar1.startPlaying();
		guitar1.stopPlaying();
		guitar1.tune();
		guitar1.startPlaying();
		
		writeToFile(outputFile, guitar1.checkStatus().toString());
		
	}
	
	public static Guitar[] createGuitarArray() {
		// Creates an array of Guitar objects
		
		Guitar[] guitarArray = new Guitar[10];
		
		for (int i = 0; i < guitarArray.length; i++) {
			guitarArray[i] = new Guitar();
		}
		return guitarArray;
	}
	
	public static void writeToFile(String outFile, String data) {
		
		File file = new File(outFile);
		if (file.exists()) {
			System.out.println(outFile + " file already exists");
			System.exit(0);
		}
			
		try {	
			PrintWriter output = new java.io.PrintWriter(file);
			output.print(data);
			output.close();
		}
		catch (FileNotFoundException ex) {
			System.out.println("File " + outFile + " not found.");
		}
	}

}

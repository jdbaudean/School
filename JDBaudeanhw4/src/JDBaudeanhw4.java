import javax.swing.JOptionPane;


public class JDBaudeanhw4 {

	public static void main(String[] args) {
		
		//Declare and create cube with the default side
		
		Cube defaultCube;
		defaultCube = new Cube();
		
		//Calcuate and print default cube values
		
		printCalculations(defaultCube);
		
		//Declare and create cube with a new side
		
		Cube newCube;
		newCube = new Cube(20);
		
		printCalculations(newCube);
		
		//Declare and create an array of Cube objects
		Cube[] cubeArray;
		cubeArray = createCubeArray();
		
		for (int i = 0; i < cubeArray.length; i++) {
			printCalculations(cubeArray[i]);
		}
	}
	
	//Array of objects
	
	public static Cube[] createCubeArray() {
		// Creates an array of Cube objects with random sides
		
		Cube[] cubeArray = new Cube[2];
		
		for (int i = 0; i < cubeArray.length; i++) {
			cubeArray[i] = new Cube((int)(Math.random() * 100) + 1);
		}
		
		return cubeArray;
	}
	
	// Pass objects to methods
	
	public static void printCalculations(Cube cube) {
		//Print volume and surface of cubes
		
		JOptionPane.showMessageDialog(null, "The volume of a cube with " + 
				" a side of " + cube.getSide() + " is " + cube.getVolume());
		JOptionPane.showMessageDialog(null, "The surface area of a cube with " +
				"a side of " + cube.getSide() + " is " + cube.getSurfaceArea());
	}

}

class Cube {
	private double side = 10;
	
	// Constructor using default value for side
	Cube() {
	}
	
	// Constructor using passed value for side
	Cube(double newSide) {
		side = newSide;
	}
	
	// Returns the value of side, this is needed because side is a private data field
	double getSide() {
		return side;
	}
	
	double getVolume() {
		return Math.pow(side, 3); 
	}
	
	double getSurfaceArea() {
		return 6 * Math.pow(side, 2);
	}
		
}

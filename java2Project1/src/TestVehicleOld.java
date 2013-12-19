
/*
 * JD Baudean
 * Project 1
 * CMIS242 OL4	
 */
import java.util.ArrayList;


public class TestVehicleOld {

	public static void main(String[] args) {
		/*
		Vehicle vehicle1 = new Car("Ford", "Taurus");
		System.out.println(vehicle1.getLicenseType());
		System.out.println(vehicle1.getMake());
		System.out.println(vehicle1.getModel());
		

		Vehicle vehicle2 = new Bus("Prevost", "Classic");
		System.out.println(vehicle2.getLicenseType());
		*/
		
		//ArrayList<Car> carArray;
		//carArray = createCarArray("Ford", "Taurus", "car");
		Car[] carArray;
		carArray = createCarArray("Ford", "Taurus", "car");
		
		Vehicle[] carArray1;
		//carArray1 = createVehicleArray("Ford", "Taurus", "car", Car.class);
		
		ArrayList<Vehicle> truckArray;
		//truckArray = createVehicleArray("Nissan", "Frontier", "truck");
		
		ArrayList<Vehicle> busArray;
		//busArray = createVehicleArray("Prevost", "Prestige", "bus");
		
		ArrayList<Vehicle> motorcycleArray;
		//motorcycleArray = createVehicleArray("BMW", "R1200GS", "motorcycle");
		
		//System.out.println(carArray.get(1).getName());
		//System.out.println(carArray.get(1).getLicenseType());
		System.out.println(carArray[1].getName());
		
		getVehicleInfo(carArray);
		/*
		getVehicleInfo(truckArray);
		getVehicleInfo(busArray);
		getVehicleInfo(motorcycleArray);
		*/
	}
	
	public static void getVehicleInfo(Vehicle[] vehicleArray) {
		for (int vehicleNumber = 0; vehicleNumber < vehicleArray.length; vehicleNumber++)
			System.out.println(vehicleArray[vehicleNumber].getName());
		
	}
	
	public static Car[] createCarArray(String make, String model, String name) {
		Car[] carArray = new Car[100];
		for (int carNumber = 0; carNumber < carArray.length; carNumber++) {
			String fullName = name + Integer.toString(carNumber + 1);
			carArray[carNumber] = new Car(make, model); 
			carArray[carNumber].setName(fullName);
			
		}
		return carArray;
	}
	
	/*
	public static void getVehicleInfo(ArrayList<Vehicle> vehicleArray) {
		for (int i = 0; i < vehicleArray.size(); i++) {
			System.out.println(vehicleArray.get(i).getMake());
			System.out.println(vehicleArray.get(i).getModel());
			System.out.println(vehicleArray.get(i).getName());
			System.out.println(vehicleArray.get(i).getLicenseType());
		}
	}
	
	
	public static ArrayList<Car> createCarArray(String make, String model, String name) {
		ArrayList<Car> carArray = new ArrayList<Car>();
		
		for (int carNumber = 0; carNumber < 100; carNumber++) {
			String fullName = name + Integer.toString(carNumber + 1);
			carArray.add(carNumber, new Car(make, model));
			carArray.get(carNumber).setName(fullName);
		}
		return carArray;
	}
	
	public static ArrayList<Vehicle> createVehicleArray(String make, String model, String name, Class<?> classType) {
		ArrayList<Vehicle> vehicleArray = new ArrayList<Vehicle>();
		
		for (int vehicleNumber = 0; vehicleNumber < 100; vehicleNumber++) {
			String fullName = name + Integer.toString(vehicleNumber + 1);
			vehicleArray.add(vehicleNumber, new classType(make, model));
			vehicleArray.get(vehicleNumber).setName(fullName);
		}
		return vehicleArray;
	}
	
	public static Vehicle[] createVehicleArray(String make, String model, String name, Class<?> classType) {
		classType[] vehicleArray = new classType[100];
		for (int vehicleNumber = 0; vehicleNumber < vehicleArray.length; vehicleNumber++) {
			String fullName = name + Integer.toString(vehicleNumber + 1);
			vehicleArray[vehicleNumber] = new classType.class(make, model); 
			vehicleArray[vehicleNumber].setName(fullName);
			
		}
		return vehicleArray;

	*/
}
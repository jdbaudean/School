/*
 * JD Baudean
 * Project 1
 * CMIS242 OL4	
 */


public class TestVehicle {

	public static void main(String[] args) {
		
		Car[] carArray;
		carArray = createCarArray("Ford", "Taurus", "car");
	
		Truck[] truckArray;
		truckArray = createTruckArray("Nissan", "Frontier", "truck");
		
		Bus[] busArray;
		busArray = createBusArray("Prevost", "Prestige", "bus");
		
		Motorcycle[] motorcycleArray;
		motorcycleArray = createMotorcycleArray("BMW", "R1200GS", "motorcycle");
		
		
		getVehicleInfo(carArray);
		getVehicleInfo(truckArray);
		getVehicleInfo(busArray);
		getVehicleInfo(motorcycleArray);
	}
	
	public static void getVehicleInfo(Vehicle[] vehicleArray) {
		
		for (int vehicleNumber = 0; vehicleNumber < vehicleArray.length; vehicleNumber++) {
			System.out.println("Vehicle name: " + vehicleArray[vehicleNumber].getName());
			System.out.println("Vehicle Make: " + vehicleArray[vehicleNumber].getMake());
			System.out.println("Vehicle Model: " + vehicleArray[vehicleNumber].getModel());
			System.out.println("Vehicle License Type: " + vehicleArray[vehicleNumber].getLicenseType());
		}
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
	
	public static Truck[] createTruckArray(String make, String model, String name) {
		
		Truck[] truckArray = new Truck[100];
		for (int truckNumber = 0; truckNumber < truckArray.length; truckNumber++) {
			String fullName = name + Integer.toString(truckNumber + 1);
			truckArray[truckNumber] = new Truck(make, model); 
			truckArray[truckNumber].setName(fullName);
		}
		return truckArray;
	}
	
		public static Bus[] createBusArray(String make, String model, String name) {
			
		Bus[] busArray = new Bus[100];
		for (int busNumber = 0; busNumber < busArray.length; busNumber++) {
			String fullName = name + Integer.toString(busNumber + 1);
			busArray[busNumber] = new Bus(make, model); 
			busArray[busNumber].setName(fullName);
		}
		return busArray;
	}
		
		public static Motorcycle[] createMotorcycleArray(String make, String model, String name) {
			
		Motorcycle[] motorcycleArray = new Motorcycle[100];
		for (int motorcycleNumber = 0; motorcycleNumber < motorcycleArray.length; motorcycleNumber++) {
			String fullName = name + Integer.toString(motorcycleNumber + 1);
			motorcycleArray[motorcycleNumber] = new Motorcycle(make, model); 
			motorcycleArray[motorcycleNumber].setName(fullName);
			
		}
		return motorcycleArray;
	}
}

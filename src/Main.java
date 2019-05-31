import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(4,4,6);
		System.out.println("Car: "+car.noOfWheels+" wheels, "+car.noOfDoors+" doors, "+ car.noOfWindows+" windows, Drive: "+car.drive+" mph, Pollutants: "+car.pollutants+"mg, Colour: "+car.colour);
		Motorcycle motorcycle = new Motorcycle(2);
		System.out.println("Motorcycle: "+motorcycle.noOfWheels+" wheels, "+motorcycle.noOfDoors+" doors, "+ motorcycle.noOfWindows+" windows, Drive: "+motorcycle.drive+" mph, Pollutants: "+motorcycle.pollutants+"mg, Colour: "+motorcycle.colour);
		Helicopter helicopter = new Helicopter(2,3,1);
		garage.info();
		System.out.println("Helicopter: "+helicopter.noOfWheels+" wheels, "+helicopter.noOfDoors+" doors, "+ helicopter.noOfWindows+" windows, "+helicopter.propellor+" propellor, Drive: "+helicopter.drive+" mph, Pollutants: "+helicopter.pollutants+"mg, Colour: "+helicopter.colour);
		ArrayList<Vehicles> arr = new ArrayList<>();
		arr.add(car);
		arr.add(motorcycle);
		arr.add(helicopter);
		for (Vehicles Info:arr) {
			if (Info.noOfWheels==4) {
				System.out.println(Info);
				System.out.println(Info.noOfWheels);
			
			}
			
								
		}

	Vehicles.fix(car.f);
	Vehicles.fix(motorcycle.f);
	Vehicles.fix(helicopter.f);
	}
	

	

}

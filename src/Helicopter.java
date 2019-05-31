
public class Helicopter extends Vehicles {
	int propellor;
	public Helicopter (int noOfDoors, int noOfWindows, int propellor) {
		int noOfWheels=0;
		this.noOfDoors=noOfDoors;
		this.noOfWindows=noOfWindows;
		this.propellor=propellor;
		this.drive=120;
		this.pollutants=100;
		colour="black";
		f=true;
	}
	public void printInfo() {
		// TODO Auto-generated method stub
		
	}
}

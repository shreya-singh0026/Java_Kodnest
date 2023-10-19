/*
public class DriverRobo {
	String name;
	String type;
	public void talk() {
		System.out.println(name +" Memory 1ZB Speed 1TB ");
	}
	public void walk() {
		System.out.println(name+" Robo is walking...");
	}
	public void charge() {
		System.out.println(name+" Robo is charge...");
	}
	public void drive() {
		System.out.println(name+" Robo is driving...");

	}
	
}
*/

class DriverRobo extends Robo{
	public void drive() {
		System.out.println(name+" Robo is driving...");
	}
}
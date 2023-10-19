/*
public class ChefRobo {
	String name;
	String type;
	public void talk() {
		System.out.println(name+" Memory 1ZB Speed 1TB ");
	}
	public void walk() {
		System.out.println(name+" Robo is walking...");
	}
	public void charge() {
		System.out.println(name+" Robo is charge...");
	}
	public void cook() {
		System.out.println( name+" Robo is cooking...");

	}
}
*/

class ChefRobo extends Robo{
	public void cook() {
		System.out.println( name+" Robo is cooking...");
	}
}
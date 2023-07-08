
public class PlanetExplorer {

	public static void main(String[] args) {
		PlanetExplorer explorer = new PlanetExplorer();
		System.out.printf("%.2f" ,explorer.calculateSurfaceArea(3.0));
	}

	public double calculateSurfaceArea(double radius) {
		return 4*Math.PI*Math.pow(radius,2);
	}
}

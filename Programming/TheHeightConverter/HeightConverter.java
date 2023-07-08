
public class HeightConverter {
	public static void main(String []args) {
		HeightConverter converter = new HeightConverter();
		System.out.printf("%.2f",converter.convertInchesToFeet(72.0));

	
	}
	public double convertInchesToFeet(double inches) {
		return inches/12;
	}
}

public class HoursConverter {

	public static void main(String[] args) {
		System.out.println(convertToHours(90));
	}
  
	public static double convertToHours(int minutes) {
		Double d=(double)minutes;
		return (d/60);
	}

}

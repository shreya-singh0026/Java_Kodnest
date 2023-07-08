import java.util.Scanner;
public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temperature in F : ");
		double fahren = sc.nextDouble();
		TemperatureConverter TemperatureConverter = new TemperatureConverter();
		System.out.printf("%.2f" ,TemperatureConverter.convertFahrenheitToCelsius(fahren));
	}

}

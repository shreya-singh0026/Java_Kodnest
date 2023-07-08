
public class FinanceApp {
	
	public static void main(String[] args) {
		FinanceApp calculator = new FinanceApp();
		System.out.printf("%.2f",calculator.calculateSimpleInterest(1000.0, 0.05, 2.0));
	}
	public double calculateSimpleInterest(double principal, double rate, double time) {
		return principal*rate*time;
	}

}

import java.util.Scanner;
public class PrimeNumber2 {

	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean res=CheckprimeNum(n);
		System.out.print(res);

	}
	public static boolean CheckprimeNum(int num) {
		if(num==1) {
			return false;
		}
		
		for(int i=2;i<num/2;i++) {
		if(num%i==0) 
				return false;
		}
		return true;
	}

}

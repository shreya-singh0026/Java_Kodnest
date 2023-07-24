import java.util.Scanner;
//Euclidean approach
public class GCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number1 : ");
		int num1=sc.nextInt();
		System.out.print("Enter Number2 : ");
		int num2=sc.nextInt();
		System.out.println("GCD OF 2 NUMBER : " + gcd1(num1,num2));
	}
	public static int gcd1(int m,int n) {
		while(n!=0) {
			int r=m%n;
			m=n;n=r;
		}
		return m;
	}
}

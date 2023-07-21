import java.util.Scanner;
public class Hcf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number1 : ");
		int num=sc.nextInt();
		System.out.print("Enter Number2 : ");
		int num2=sc.nextInt();

		int Hcf=calculateHcf(num,num2);
		System.out.println("HCF of "+ num + " and " + num2 + " is "+Hcf);
	}
	public static int calculateHcf(int m,int n) {
		while(m!=n) {
			if(m>n) 
				 m=m-n;
			else
				n=n-m;
			}
			return m;
  }
}

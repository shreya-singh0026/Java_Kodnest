//Problem Statement : Vending Machine Simulator

/*Question Description: 
 * Create a program that simulates a vending machine. 
 * The program should take a product code as input and output the product name.

Boiler Plate Code:
public class Main
{
public static void getProduct(String productCode)
{
// your code here
}
public static void main(String[] args)
{

}
}

Sample Input: "P01"
Sample Output: "Coca Cola"
	*/

import java.util.Scanner;
public class Main {
	public static void getProduct(String productCode)
	{
		switch(productCode){
		case "p01":
			System.out.println("COCA COLA");
			break;
		case "p02":
			System.out.println("SPRITE");
			break;
		case "p03":
			System.out.println("THUMS UP ");
			break;
		case "p04":
			System.out.println("PEPSI");
			break;
		case "p05":
			System.out.println("MIRINDA");
			break;
		case "p06":
			System.out.println("MAAZA");
			break;
		default:
			System.out.println("INVALID PRODUCT CODE");
			}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Product Code : ");
		String code=sc.next();
		getProduct(code);
		sc.close();
	}
}

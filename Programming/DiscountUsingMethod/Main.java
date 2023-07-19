//Problem Statement
/*
Create a program that checks if the purchase is above $100 and prints "Discount Applicable". 
The program should accept a double 'purchaseAmount' as input.

Boiler Plate Code:
public class Main
{
public static void checkDiscount(double purchaseAmount)
{ // your code here   }
public static void main(String[] args)
{   }
}

*/

import java.util.*;
public class Main {
		public static void checkDiscount(double purchaseAmount) 
		{
			if(purchaseAmount>100)
				System.out.println("Discount Applicable");
			else 
				System.out.println("Discount Not Applicable");
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Purchase Amount :");
			double purchaseAmount=sc.nextDouble();
			//In Static Method,there is no need to create object to call a method
			checkDiscount(purchaseAmount);
		}
	}
		
		

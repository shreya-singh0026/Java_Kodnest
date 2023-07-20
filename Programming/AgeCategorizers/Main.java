// * Problem Statement : Age Categorizer
/* Question Description: 
 * Create a program that categorizes people based on their age: Child (0-12), Teen (13-19), Adult (20-59), Senior (60+). 
 * The program should accept an integer 'age' as input.

Boiler Plate Code:
public class Main
{
public static void categorizeAge(int age)
{
// your code here
}

public static void main(String[] args)
{
}

}

Sample Input: 25
Sample Output: Adult
 */

import java.util.Scanner;
public class Main {
	public static void categorizeAge(int age)
	{
		if(age>=0 && age<=12)
			System.out.println("Child");
		else if(age>=13 && age<=19)
			System.out.println("Teen");
		else if(age>=20 && age<=59)
				System.out.println("Adult");
		else if(age>=60)
			System.out.println("Senior");
		else
			System.out.println("Invalid Age");

	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Age to categorizes people based on their age : ");
		int age=sc.nextInt();
		categorizeAge(age);
	}
}

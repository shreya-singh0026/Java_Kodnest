//Problem Statement 2: Grade Check

/*Question Description: 
 * Create a program that checks if a student's grade is above 50 and 
 * prints "Pass", else it prints "Fail". 
 * The program should accept an integer 'grade' as input.

Boiler Plate Code:
public class Main
{

public static void checkGrade(int grade)

{ // your code here

}

public static void main(String[] args)

{

}

}

Sample Input: 55
Sample Output: Pass
 * */

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Grade : ");
		int Studgrade=sc.nextInt();
		//In Static Method,there is no need to create object to call a method
		checkGrade(Studgrade);
	}
		
	public static void checkGrade(int grade)
	{
		if(grade>50)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
}

//Problem Statement : Multiple Checker
/*Question Description: 
 * Create a program that checks if 1st number is a multiple of 2nd number. 
 * The program should accept an integer 'm ' and 'n' as input.

Boiler Plate Code:

public class Main
{
public static void checkMultipleOfTen(int m,int n)
{
// your code here
}

public static void main(String[] args)
{
}

}

Sample Input: 20,10
Sample Output: 20 is a multiple of 10

*/
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Number : ");
		int num=sc.nextInt();
		int num1=sc.nextInt();
		//In Static Method,there is no need to create object to call a method,we can directly call a method using classname.methodname()
		checkMultipleOfTen(num,num1);
	}
	public static void checkMultipleOfTen(int m,int n)
	{
		if(m%n==0)
			System.out.println(m + " is a multiple of "+ n);
		else
			System.out.println(m + " is not a multiple of "+n);
	}
}

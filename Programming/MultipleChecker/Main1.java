//Problem Statement : Multiple of Ten Checker
/*Question Description: 
 * Create a program that checks if a number is a multiple of 10. 
 * The program should accept an integer 'n' as input.

Boiler Plate Code:

public class Main
{
public static void checkMultipleOfTen(int n)
{
// your code here
}

public static void main(String[] args)
{
}

}

Sample Input: 20
Sample Output: The number is a multiple of 10

*/
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=sc.nextInt();
		//In Static Method,there is no need to create object to call a method,we can directly call a method using classname.methodname()
		checkMultipleOfTen(num);
	}
	public static void checkMultipleOfTen(int n)
	{
		if(n%10==0)
			System.out.println(n + " is a multiple of 10.");
		else
			System.out.println(n + " is not a multiple of 10.");
	}
}

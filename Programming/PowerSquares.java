//Problem: The Power of Squares

/*You are a software developer at a gaming company. 
 * The company is developing a new game called "The Power of Squares". 
 * In this game, players have to square the number provided to advance to the next level. 
 * Your task is to create a function that will calculate the square of the number provided.

Function:
public static int squareNumber(int num);

Inputs:
The function squareNumber(int num) will receive one parameter:
- num : an integer which represents the number that the player has to square.

Outputs:
The function will return an integer - the square of num.

Example:
Sample Input:
squareNumber(7);

Sample Output:
49

Note:
In the sample input, the player is at a level where the number to square is 7.
The square of this number is 7*7=49, so the function returns 49 as the output.
The function you develop will be a crucial part of "The Power of Squares" game,
ensuring players can progress through levels accurately.
Good luck, game developer!

*/
import java.util.Scanner;

public class PowerSquares {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		System.out.println(squareNumber(num));
	}
	public static int squareNumber(int num) {
		return num*num;
	}
}

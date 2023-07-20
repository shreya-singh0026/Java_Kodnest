//Problem Statement 1: Polygon Identifier

/*Question Description: 
 * Create a program that identifies the type of a polygon based on the number of its sides. 
 * The program should accept an integer 'sides' as input.

Boiler Plate Code:
public class Main { 

public static void identifyPolygon(int sides)
{ // your code here } 

public static void main(String[] args) 
{ //identifyPolygon(4);  }

}

Sample Input: 4
Sample Output: Quadrilateral

 */

import java.util.Scanner;
public class Main {

public static void identifyPolygon(int sides)
{
	switch(sides) {
	case 3:
		System.out.print("Traingle");
		break;
	case 4:
		System.out.print("Quadilateral");
		break;
	case 5:
		System.out.print("Pentagon");
		break;
	case 6:
		System.out.print("Hexagon");
		break;
	case 7:
		System.out.print("Heptagon");
		break;
	case 8:
		System.out.print("Octagon");
		break;
	case 9:
		System.out.print("Nonagon");
		break;
	default:
		System.out.print("Polygon");
		break;
	}
} 

public static void main(String[] args) 
{ 
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Number of Sides : ");
	int sides=sc.nextInt();
	identifyPolygon(sides);  
}
}

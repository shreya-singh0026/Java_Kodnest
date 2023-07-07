package control_constructs;
import java.util.*;
public class Assignment1 {

//WAP to find the difference of 2 number
//if first number is greater than 2 number then subtract 2nd number with 1st number else 1st number with 2nd number
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Number : ");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(b-a);
		}
		else
		{
			System.out.println(a-b);
		}
		
	}

}

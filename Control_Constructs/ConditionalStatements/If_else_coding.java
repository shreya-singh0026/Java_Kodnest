package control_constructs;
import java.util.*;
public class If_else_coding {
//IF-ELSE STATEMENT
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age : ");
		int age=sc.nextInt();
		if(age>18)
			System.out.println("Eligible for voting");
		else
			System.out.println("Not Eligible for voting");

	}

}

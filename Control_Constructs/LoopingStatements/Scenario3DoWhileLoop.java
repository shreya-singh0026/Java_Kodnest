package control_constructs;
import java.util.*;
public class Scenario3DoWhileLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int pageno=100;

		boolean board=true;

		int i=1;

		do{

		System.out.println("KodMan read page "+i);

		i++;

		System.out.println("Do You want to continue ?");

		board=scan.nextBoolean();

		}while(board);

		}
}

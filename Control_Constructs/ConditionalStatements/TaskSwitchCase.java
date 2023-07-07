package control_constructs;
import java.util.*;
public class TaskSwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day between 1 to 7 : ");
		int day=sc.nextInt();
		switch (day) {
		    case 1:
		        System.out.println("Sunday Funday");
		        break;
		    case 2:
		        System.out.println("Boring Monday ");
		        break;
		    case 3:
		        System.out.println("Frustating Tuesday");
		        break;
		    case 4:
		        System.out.println("Amazing Wednesday");
		        break;
		    case 5:
		        System.out.println("veg Thursday");
		        break;
		    case 6:
		        System.out.println("Curious Friday");
		        break;
		    case 7:
		        System.out.println("Loving Saturday");
		        break;
		    default:
		        System.out.println("Please Enter day between 1 to 7 .");
		}
	}

}

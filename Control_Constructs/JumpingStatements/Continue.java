package control_constructs;

public class Continue {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
			if(i==2)
			{
			continue; //continue m bs us iteration ko skip krega aur uske niche kuch v code rha toh print nhi krega
			}
			System.out.println("KODNESTS");

		}
		System.out.println("OUT OF CONSTRUCTS");
	}

}

package control_constructs;

public class Break_Example {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++) {
			System.out.println(i);
			if(i==3)
			{
				System.out.println("omkar");
				break;//break m current pure loop se hi bahr ho jaiga
			}
			else {
				System.out.println("prahalad");

			}
			System.out.println("KODNESTS");

		}
		System.out.println("OUT OF CONSTRUCTS");
	}

}

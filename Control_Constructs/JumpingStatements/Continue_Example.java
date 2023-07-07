package control_constructs;

public class Continue_Example {

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
				continue;
			}
		//	System.out.println("KODNESTS");//continue k bd koi v statement unreachable hota h

		}
		System.out.println("OUT OF CONSTRUCTS");
	}

}

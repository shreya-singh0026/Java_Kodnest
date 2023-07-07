package control_constructs;
public class Break {
	public static void main(String[] args) {
		/*
		for(int i=0;i<5;i++) {
			System.out.println(i);
			break;
		}
		System.out.println("OUT OF CONSTRUCTS");
		*/
		
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
			if(i==2)
			{
        break;//break m current pure loop se hi bahr ho jaiga
			}
			System.out.println("KODNESTS+");
		}
		System.out.println("OUT OF CONSTRUCTS");
	}
}

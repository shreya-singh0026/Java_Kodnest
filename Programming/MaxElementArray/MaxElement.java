import java.util.Scanner;
public class MaxElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array length : ");
		int n=sc.nextInt();		
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=	sc.nextInt();
		}
		maxElement(arr);
	}
	public static void maxElement(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("Maximum Element in an array : "+max);
	}

}

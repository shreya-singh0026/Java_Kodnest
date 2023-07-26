//palindrome number-->reverse number is equal to original number

public class Palindrome {
	public void palin(int n) {
		int org=n;
		int rev=0;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println("Reverse Number : "+rev);
		if(org==rev) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome Number");

		}
	}
}

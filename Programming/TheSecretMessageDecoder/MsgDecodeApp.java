import java.util.*;
public class MsgDecodeApp {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		MessageDecoder md = new MessageDecoder();
		System.out.println(md.decodeCharacter(c));
		
	}
}

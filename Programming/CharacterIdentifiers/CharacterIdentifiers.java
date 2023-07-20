//Problem Statement : Character Identifier
/*
Question Description: 
Create a program that identifies a character as a lower-case vowel, upper-case vowel, 
lower-case consonant, upper-case consonant, digit, or special character. 
The program should accept a character 'ch' as input.

Boiler Plate Code:
public class Main
{
public static void identifyCharacter(char ch)
{
// your code here
}

public static void main(String[] args)
{
}

}

Sample Input: 'a'
Sample Output: Lower-case vowel
*/

import java.util.Scanner;
public class CharacterIdentifiers {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character to check for digit or vowel or consonent : ");
		char ch=sc.next().charAt(0);
		identifyCharacter(ch);
	}

	
	public static void identifyCharacter(char ch)
	{
		if(Character.isDigit(ch)) {
			System.out.println("Entered Character " + ch + "is Digit");
		}
		else if(!(Character.isLetter(ch))) {
			System.out.println("Entered Character " + ch + " is Special Character");
			
		}
		else {
			switch(Character.toLowerCase(ch)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch)) {
					System.out.println("Entered Character" + ch + " is LowerCase Vowel");
					
				}
				else {
					System.out.println("Entered Character" + ch + " is UpperCase Vowel");
				}
				break;
				default:
					if(Character.isLowerCase(ch)) {
						System.out.println("Entered Character" + ch + " is LowerCase Consonant");
						
					}
					else {
						System.out.println("Entered Character" + ch + " is UpperCase Consonant");
					}
			
			}
		}
	}

}


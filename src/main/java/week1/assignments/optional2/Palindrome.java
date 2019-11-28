package week1.assignments.optional2;

public class Palindrome {

	public static void main(String[] args) {
		//Declare a String text with a value
				String text = "madam";
				//Declare another String rev
				String rev = "";
				// Iterate over the String in reverse order
				for (int i = text.length()-1; i>=0; i--) {
					rev+=text.charAt(i);	
				}
				System.out.println("Reversed string is"+rev);
				if(rev.equals(text))
				{
					System.out.println(text+" is a  palindrome");
				}
					else
					{
						System.out.println(text+" is not a  palindrome");
					}
				}
				//Build a logic to find the given string is palindrome or not
				/*
				 * Pseudo Code
				 * a) Iterate over the String in reverse order
				 * b) Add the char into rev
				 * c) Compare text and rev, if it is same then print palindrome 
				 */

	}

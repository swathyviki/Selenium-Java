package week1.assignments.optional;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		       //Declare a String 
				String text1 = "stops";
				//Declare another String
				String text2 = "potss";
				
				//build logic to check the given words are anagram or not
				if(text1.length()==text2.length())
				{
					char[] char1=text1.toCharArray();
					char[] char2=text2.toCharArray();
					Arrays.sort(char1);
					Arrays.sort(char2);
					
							if(Arrays.equals(char1,char2))
							{
								System.out.println(text1 +" & " + text2+ " are equal.Hence its a anagram");
							}
							else
							{
								System.out.println(text1+" & " +  text2+ " are not equal.Hence its not a anagram");
							}
					
					}
				else
				{
					System.out.println(text1+" & " +  text2+ " are not equal.Hence its not a anagram");
				}
				/*
				 * Pseudo Code
				 * a) Check length of the strings are same then
				 * b) Convert both Strings in to characters
				 * c) Sort Both the arrays
				 * d) Check both the arrays has same value
				 * 
				 */

	}

}

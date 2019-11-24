package day2.classroom.strings;



public class FindTypes {


	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Automation Class $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;

		//Convert the String to character array
		char[] charArray = test.toCharArray();
		//Traverse through each character (using loop)
		for(int i=0; i<charArray.length;i++)
		{
//			//Find if the given character is what type using (if)
//			Character.isLetter
//			ii) Character.isDigit
//			iii)Character.isSpaceChar
//			iv) else -> consider as special character
			
			if(Character.isLetter(charArray[i]))
			{
				letter=letter+1;
			}
			else if(Character.isDigit(charArray[i]))
			{
				num=num+1;
			}
			else if(Character.isSpaceChar(charArray[i]))
			{
				space=space+1;
			}
			else
			{
			specialChar=specialChar+1;
			}
				
		}
		// Build the logic to find the count of each
		/* Pseudo Code:
			a) 
			
			b) Traverse through each character (using loop)
			c) Find if the given character is what type using (if)
					i)  Character.isLetter
					ii) Character.isDigit
					iii)Character.isSpaceChar
					iv) else -> consider as special character
		*/

		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

}

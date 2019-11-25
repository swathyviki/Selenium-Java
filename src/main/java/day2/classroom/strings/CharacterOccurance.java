package day2.classroom.strings;

public class CharacterOccurance {

	public static void main(String[] args) {
		// Here is the input
		String test = "I am getting better with Java";

		// Here is what the count you need to find
		char ch = 't';
		int totalCount = 0;
		// Convert the String to character array
		char[] charArray = test.toCharArray();
		// Traverse through each character (using loop)
		for(int i=0; i<charArray.length;i++)
		{
			//If the given character matches the expected character (ch), Then, increment totalCount
			if(charArray[i]==ch)
			{
				totalCount=totalCount+1;
				
			}
		}
		// Print the count here
		System.out.println("Total count of character("+ch+"): " + totalCount);
		
	}

}

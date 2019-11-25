package day2.classroom.strings;

public class ReverseStr {

	public static void main(String[] args) {
		
		// Here is the input
		String test = "feeling good";
		
		//Convert the String to character array
         char[] charArray = test.toCharArray();
         
         //Traverse through each character (using loop in reverse direction)
         for(int i=charArray.length-1;i>=0;i--)
         {
        	 //Print the character (without newline
        	 System.out.print(charArray[i]);
         }
		
		
	}

}

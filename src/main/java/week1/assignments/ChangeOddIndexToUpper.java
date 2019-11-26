package week1.assignments;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) {
		
		// Here is the input
				String test = "changeme";
				//a) Convert the String to character array
				char[] charArray= test.toCharArray() ;
				//b) Traverse through each character (using loop)
				for(int i=0;i<charArray.length;i++)
				{
				//find the odd index within the loop (use mod operator)
					if(i%2 == 1)
					{
						/*within the loop, change the character to uppercase 
						if the index is odd else don't change*/
						System.out.print(Character.toUpperCase(charArray[i]));
					}
					
				}
	}
	
	}


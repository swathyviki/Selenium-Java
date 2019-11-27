package week1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// Here +++is the input
		String test="I am a software tester";
	
		String[] splitTest=test.split(" ");
		// Traverse through each word (using loop)
		for (int i = 0; i < splitTest.length; i++) {
			// find the odd index within the loop (use mod operator)
			if(i%2==1)
			{
				//split the words and have it in an array
				char[] charArray=splitTest[i].toCharArray();
				for(int j=charArray.length-1;j>=0;j--)
				{
					//print the even position words in reverse order using another loop (nested loop)
					
					System.out.print(charArray[j]);
					
				}
			}
			else
			{
				// Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
				System.out.print(" "+splitTest[i]+" ");
			}
			
					
			}
		}
		
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		
		/* Pseudo Code:
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		d) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		e) print the even position words in reverse order using another loop (nested loop)
		 
	*/
		
		

	}


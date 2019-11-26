package week1.assignments;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learnt java basics as part of java sessions in week1";
		// Initialise an integer variable as count
		int count = 0;
		//a) Split the String into array and iterate over it 
		String[] splitText = text.split(" ");
		
		for(int i=0; i< splitText.length;i++)
		{
			if(splitText[i]!=null)
			{
			//Initialise another loop to check whether the word is there in the array 
			for(int j=i+1;j<splitText.length;j++)
			{
				
				
				if(splitText[i].equals(splitText[j]))
				{
					splitText[j]=null;
					
					count=count+1;
				}
							
			}
			
			}
		}
		System.out.println("No of duplicates found is"+count);
		for(int k=0;k<splitText.length;k++)		//Displaying the String without duplicate words	
		{
			if(splitText[k]!=null)
			{
				System.out.println(splitText[k]);
			}
			
	     }  
		}
		
			/*
			 * Pseudo code 
			 * a) Split the String into array and iterate over it 
			 * b) 
			 * c) if it is available then increase and count by 1. 
			 * d) if the count > 1 then replace the word as "" 
			 * e) print the each word
			 */

	}



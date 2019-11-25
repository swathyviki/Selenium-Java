package day2.classroom.arrays;

import java.util.Arrays;

public class MissingElement {
	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,4,6,7,8};
				
		//Arrange the array in ascending order
		Arrays.sort(data);
		
		//Traverse through each array item
		for(int i=0;i<data.length-1;i++)	
					
		{
			//If the following one is not +1 -> Print as missing
			if(data[i+1]!=data[i]+1)
				
			{
				System.out.println("Missing number is "+(data[i]+1));
				break;
			}
		}
	}
}

package week1.assignments.optional2;

public class FindAllPrimeNumbers {

	public static void main(String[] args) {
		//Declare an int variable range with value 100
		int range = 100;
		//Declare another int variable for counting
		int count = 0;
		//Iterate a loop with i from 1 to range
		for (int i = 1; i < range; i++) {
		//Iterate another loop with j from 1 to i (nested loop)
		for(int j=1;j<=i;j++)
		{
			//Check if i is divisible by j, if so, increase the count
			if(i%j == 0)
			{
				count = count+1;
			}
		}
		//if count is 2, then print i
		if(count ==2)
		{
			System.out.print(i+" ");
		}
		//Make sure that count is reset to 0 for each iteration
		count=0;
			
		}
	}
}



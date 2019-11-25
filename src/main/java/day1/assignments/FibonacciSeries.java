package day1.assignments;

public class FibonacciSeries {
	
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8
	 * output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)Fibonacci series is a series formed by adding 2 previous numbers until range
	 * 2)use for loop to iterate to a range
	 * 3) in the loop firstnum becomes secnum(also secnum becomes sum) in order to add the next number in the series
	 * 
	 */
	
	public static void main(String[] args) {
		
		// initialize 3 int variables (Tip: range & firstNum, secNum in the series)
		int range=8;int firstNum =0;int secNum =1;
		//added dummy comment
		
		// Iterate from 1 to the range
		 for (int i=1; i <=range;i++)
		 {
			// Print first number
			 System.out.print(firstNum+",");
			// add first and second number
			int sum = firstNum+secNum;
			
			// Assign second nuumber to the first number
			firstNum =secNum ;
			// Assign sum to the second number
			secNum = sum;
		

	}

}
}

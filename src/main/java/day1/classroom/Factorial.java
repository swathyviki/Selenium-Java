package day1.classroom;

public class Factorial {
	
	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)logic behind factorial is to  multiply all whole numbers from our chosen number down to 1
	 * 2)can be done by decrementing the for loop from input till 1 and multiplying each with fact
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {

		// Declare your input number
		int i=5;
		
		
		// Declare and initialize an integer variable by name: fact
		int fact=1;

		// Iterate from 1 to your input (tip: using loop concept)
		for(int n=i;n>=1;n--)
		{

			// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
		fact=fact*n;	

		//End of loop
		
		}
		// Print factorial (fact)
		System.out.println("factorial of "+i+" is "+fact );
		}
	
	}

package week1.assignments.optional2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// Declare a String text with the following value
				String text = "Tes12Le79af65";
				// Declare a int variable sum
				int sum = 0;
				
				//build a logic to get sum of all the digits from the given string
				//Method1:
				//using replaceAll(), replace all the non-digits into ""
					 text=text.replaceAll("[0-9]", "");
				   	System.out.println(text);
				   	// Now, convert the String into array
					char[] charArray=text.toCharArray();
					//Iterate over the array and get each character
					for (int i = 0; i < charArray.length; i++)
					{
						//Using Character.getNumericValue(), Change the char into int
						 //Add the values to sum & print
						System.out.println("Value of character "+ charArray[i]+" is "+Character.getNumericValue(charArray[i]));
						sum=sum+Character.getNumericValue(charArray[i]);
				   }
					System.out.println("Sum of digits is "+ sum);
					//Method2:
					//Initialising sum for method 2:
					sum=0;
				
				 char[] ch={'T','e','s','1','2','L','e','7','9','a','f','6','5'};  
				 
				 for(int i=0;i<ch.length;i++)
				 {
					 if(Character.isDigit(ch[i])!=true)
					 {
						 sum=sum+Character.getNumericValue(ch[i]);
						 System.out.println("Value of character "+ ch[i]+" is "+Character.getNumericValue(ch[i]));
					 }
					 
				 }
				 System.out.println("Sum of digits is "+ sum);
				 
				 /*
				 * Method 1
				 * Pseudo Code
				 * a) using replaceAll(), replace all the non-digits into ""
				 * b) Now, convert the String into array
				 * c) Iterate over the array and get each character
				 * d) Using Character.getNumericValue(), Change the char into int
				 * e) Add the values to sum & print
				 * 
				 */
				
				/*
				 * Method 2
				 * Pseudo Code
				 * 
				 * a) Iterate an  array over the String
				 * b) Get each character and check if it is a number using Character.isDigit()
				 * c) Now covert char to int using Character.isDigit() and add it to sum
				 * d) Now Print the value
				 */

	}

}

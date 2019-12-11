package week3.assignments.mandatory.assignment3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PrintDuplicates {
	public static void main(String[] args) {
		Map<Character,Integer> charCount=new LinkedHashMap<Character,Integer>();
		String string="Infosys Limited";
		string=string.replaceAll("\\s","");
		System.out.println("String without spaces is "+string);
		char[] eachchar=string.toCharArray();
		for (char c : eachchar) {
			if(charCount.containsKey(c))
			{
				Integer value=charCount.get(c)+1;
				charCount.put(c, value);
			}
			else
			{
				charCount.put(c, 1);
			}
		}
		List<Character> dupliString=new ArrayList<Character>();
		for (Entry<Character, Integer>  echEntry : charCount.entrySet()) {
			System.out.println("Count of each character is "+echEntry.getKey()+"->"+echEntry.getValue());
			if(echEntry.getValue()>1)
			{
				
				dupliString.add(echEntry.getKey());
			}
			
		}
		
		System.out.println("Printing duplicates is "+ dupliString);
			
		
		
	}
}

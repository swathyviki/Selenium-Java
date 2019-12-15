package week3.assignments.mandatory.assignment3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintDistinct {
	public static void main(String[] args) {
		Map<Character,Integer> charCount=new LinkedHashMap<Character,Integer>();
		String string="Amazon India Private Limited";
		string=string.replaceAll("\\s","");
		System.out.println("String without spaces is "+string);
		char[] eachchar=string.toCharArray();
		Set<Character> dist=new LinkedHashSet<Character>();
		for (Character character : eachchar) {
			dist.add(character);
		}
		StringBuilder sb = new StringBuilder(); 
		for (Character character : dist) {
			sb.append(character);
		}
	System.out.println(sb);
	
		/*Method 2
		 * for (char c : eachchar) {
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
		System.out.println("Map entries are:"+charCount);
		List<Character> distString=new ArrayList<Character>();
		for (Entry<Character, Integer>  echEntry : charCount.entrySet()) {
			System.out.println("Count of each character is "+echEntry.getKey()+"->"+echEntry.getValue());
			if(echEntry.getValue()==1)
			{
				
				distString.add(echEntry.getKey());
			}
			
		}
		
		System.out.println("Printing duplicates is "+ distString);
			*/
		
		
	}

}

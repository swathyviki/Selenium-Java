package week3.assignments.mandatory.assignment3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicates {
public static void main(String[] args) {
	Map<Character,Integer> charCount=new LinkedHashMap<Character,Integer>();
	String string="PayPal India";
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
	List<Character> rmvdString=new ArrayList<Character>();
	for (Entry<Character, Integer>  echEntry : charCount.entrySet()) {
		System.out.println("Count of each character is "+echEntry.getKey()+"->"+echEntry.getValue());
		if(!(echEntry.getValue()>=2))
		{
			
			rmvdString.add(echEntry.getKey());
		}
		
	}
	StringBuilder sb = new StringBuilder(); 
	for (Character character : rmvdString) {
		sb.append(character);
	}
	System.out.println("String after removing duplicates is "+ sb);
		
	}
	
}


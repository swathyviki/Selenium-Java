package week3.assignments.mandatory.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SecondRepeating {
public static void main(String[] args) {
	Map<Character,Integer> charCount=new LinkedHashMap<Character,Integer>();
	String string="PPPayyyPPal Indiaa";
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
	List<Integer> rmvdString=new ArrayList<Integer>();
	for (Entry<Character, Integer>  echEntry : charCount.entrySet()) {
		System.out.println("Count of each character is "+echEntry.getKey()+"->"+echEntry.getValue());
	rmvdString.add(echEntry.getValue());
	}
	Collections.sort(rmvdString);
	int secnd=rmvdString.get(rmvdString.size()-2);
	System.out.println("count of second most repeating charcter is"+secnd);
	System.out.println("Map data is"+charCount);
	for (Entry<Character, Integer>  echEntry : charCount.entrySet()) {
		if(secnd==echEntry.getValue())
		{
	System.out.println("Second most repeating charcter is"+echEntry.getKey());
	}
	
	}
	

		
	}
	
}


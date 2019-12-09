package day5.classroom;
import java.util.*;
import java.util.Map.Entry;
public final class charactercountMap {
	public static void main(String[] args) {
		String name="Preethi Sylvia";
		name=name.replaceAll("\\s", "");
		System.out.println(name);
		char[] nameArray=name.toCharArray();
		Map<Character,Integer> nameMap=new LinkedHashMap<>();
		
	for (char c : nameArray) {
		if(nameMap.containsKey(c))
		{
			Integer value=nameMap.get(c)+1;
			nameMap.put(c,value);
			
		}
		else
		{
			nameMap.put(c,1);
			
		}
	}
		
			
			
	
		for(Entry<Character,Integer> eachentry:nameMap.entrySet())
		System.out.println(eachentry.getKey()+"->"+eachentry.getValue());
	}

}

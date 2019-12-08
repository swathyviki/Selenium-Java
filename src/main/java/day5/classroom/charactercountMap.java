package day5.classroom;
import java.util.*;
import java.util.Map.Entry;
public final class charactercountMap {
	public static void main(String[] args) {
		String name="Swaathy";
		char[] nameArray=name.toCharArray();
		Map<Character,Integer> nameMap=new LinkedHashMap<>();
		int value=1;
		for(int i=0;i<nameArray.length;i++)
		{
			
			if(nameMap.containsKey(nameArray[i]))
			{
				nameMap.put(nameArray[i],value+1);
				
			}
			else
			{
				nameMap.put(nameArray[i],value);
				
			}
	}
		for(Entry<Character,Integer> eachentry:nameMap.entrySet())
		System.out.println(eachentry.getKey()+"->"+eachentry.getValue());
	}

}

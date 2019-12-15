package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Assignment {

	public static void main(String[] args) {
		String text = "PayPPal Indiiaa";

		char[] charArray = text.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (char ch : charArray) {

			if (map.containsKey(ch)) {

				map.put(ch, map.get(ch) + 1);

			} else {

				map.put(ch, 1);

			}

		}
		System.out.println(map);
		
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		
		Set<Integer> count= new TreeSet<>();
		
		for (Entry<Character, Integer> eachEntry : entrySet) {
			Integer value = eachEntry.getValue();
			count.add(value);
			
		}
		
		System.out.println(count);
		
		List<Integer> listCount = new ArrayList<>(count);
		
		Collections.reverse(listCount);
		
		System.out.println(listCount.get(1));
		
		for (Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue()==listCount.get(1)) {
				System.out.println(entry.getKey());
			}
			
			
		}
		

	}

}
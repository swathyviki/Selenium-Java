package week3.assignments.mandatory.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Reversesort {
	public static void main(String[] args) {
		List<String> companyNames=new ArrayList<String>();
		companyNames.add("HCL");
		companyNames.add("Aspire Systems");
		companyNames.add("CTS");
		System.out.println("Items in the list are: "+companyNames);
		Collections.sort(companyNames);
		System.out.println("sorted list is "+ companyNames);
		Collections.reverse(companyNames);
		System.out.println("Reverse list is"+companyNames);
			
	}


}

package day4.classroom;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		String companyInfo="Amazaon has more than 51000 employees in 18 states in India";
		String[] split = companyInfo.split("\\s+");
	for (String everyWord : split) {
		System.out.println(everyWord);
	}
		int length = split.length;
		System.out.println("Length of the string "+length);
		String replaceAll = companyInfo.replaceAll("\\D", "");
		System.out.print("Digits are"+replaceAll);
		
	

	String email="swathynayak@gmail.com";
	String pat="[a-z0-9]+@[a-z]+.[a-z]{2,3}";
	Pattern compile1 = Pattern.compile(pat);
	Matcher matcher1=compile1.matcher(email);
	System.out.println("\n"+"Email pattern is matching?"+matcher1.matches());
	
}
}

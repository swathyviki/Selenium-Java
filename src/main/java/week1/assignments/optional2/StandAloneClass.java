package week1.assignments.optional2;



import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import cucumber.api.cli.Main;

public class StandAloneClass {
	private int number;
	
	
public void setNumber(int num)
{
	this.number=num;
}
public int getNumber() {
	System.out.println("number is "+number);
	return this.number;
}

public static void main(String[] args) {
	StandAloneClass sc=new StandAloneClass();
	sc.setNumber(10);
	int num=sc.getNumber();
	
}
}

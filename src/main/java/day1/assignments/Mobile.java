package day1.assignments;

public class Mobile {

	public boolean makeCall(long number)
	{
		System.out.println("Call" + number);
		return true;
		
	}
	
	public String sendSMS(String s)
	{
		System.out.println("SMS sent is "+ s);
		return s;
	}
	
	public boolean shutDown()
	{
		System.out.println("Mobile shutdown");
		return true;
	}
	
	
	public static void main(String[] args) {
		
		Mobile redmi = new Mobile();
		boolean makeCall = redmi.makeCall(8870415213L);
		String sendSMS = redmi.sendSMS("Hello");
		System.out.println(sendSMS);
		redmi.shutDown();
	}
}

		

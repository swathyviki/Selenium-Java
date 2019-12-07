package day5.classroom;

public class Mobile {
	
	public void Call(){
		System.out.println("Call connected");
		
	}
	public void sendSMS(String sms) {
		
		System.out.println(sms);
	}
	public void camera() {
		System.out.println("phone doesnt have a camera");
	}
	public static void main(String[] args) {
		Mobile name =new Mobile();
		name.Call();
		name.sendSMS("Hi");	
		name.camera();
	}

}

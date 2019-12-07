package day5.classroom;

public class Redmi extends Mobile{
	
	public void camera(int noofcameras)
	{
		System.out.println("No of cameras"+noofcameras);
	}
	public static void main(String[] args) {
		Redmi mi=new Redmi();
		mi.Call();
		mi.sendSMS("Msg from my Mi phone");
		mi.camera(1);
		
	}

}


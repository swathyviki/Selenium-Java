package day5.classroom;

public class Samsung extends Mobile{
	public void camera(String cameratype,int resolution)
	{
		System.out.println(cameratype+":");
		System.out.println("Has resolution "+resolution);
		
	}
	public static void main(String[] args) {
		Samsung lava=new Samsung();
		lava.Call();
		lava.sendSMS("Msg from my Samsung lava phone");
		lava.camera("frontcam",584);
		lava.camera("backcam",1086);
	}

}

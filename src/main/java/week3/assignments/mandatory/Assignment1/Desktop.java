package week3.assignments.mandatory.Assignment1;

public class Desktop implements Hardware,Software{
	public String desktopModel() {
		return "Dell Inspiron";
	}

	public String hardwareResources()
	{
		return "4GB RAM,frontcam,intelcore processor";
	}
	public String softwareResources()
	{
		return "Word 2013,eclipse,music player,team viewer";
	}
	public static void main(String[] args) {
		Desktop dell=new Desktop();
		System.out.println("Desktop Model: "+dell.desktopModel());
		System.out.println("Hardware resources: "+dell.hardwareResources());
		System.out.println("Software resources: "+dell.softwareResources());
		
	}
	
}

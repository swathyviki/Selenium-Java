package day6.classroom;

public class RemoteBrowser implements Browser {
	public void locateElement(String locator)
	{
	System.out.println(locator);	
	}
	public String getTitle()
	{
		return("HomePage");	
		
	}
	public void close() 
	{
		System.out.println("Close");	
	}
	public static void main(String[] args) {
		RemoteBro
	}
}

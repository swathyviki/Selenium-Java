package day6.classroom;

public interface Browser {
	public void locateElement(String locator);
	public String getTitle();
	public void close();

}

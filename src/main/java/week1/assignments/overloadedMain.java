package week1.assignments;


public class overloadedMain {
		   
	    public static void main(String arg1)
	    {
	        System.out.println("main(String arg1)"+arg1);
	    }

	    public static void main(String arg1, String arg2) 
	    {
	        System.out.println("main(String arg1, String arg2)"+arg1+" "+arg2);
	    }
	

public static void main(String[] args)
{
	overloadedMain ovMain= new overloadedMain();
    System.out.println("main(String[] args)");
    ovMain.main("Swathy");
    ovMain.main("swathy","viki");
}
}
		

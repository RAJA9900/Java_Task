package july_28;

public class Second_task {
	
	public static void main(String[] args)
	{
		System.out.println(checksecure("https://www.google.com/"));
		System.out.println(checksecure("http://www.gamefever.com/"));
		System.out.println(checksecure("https://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(checksecure("http://en.wikipedia.org/wiki/Main_Page"));
	}
	
    
	
	
	
	public static String checksecure(String address)
	{
		if(address.startsWith("https://"))
		{
			return "secure";
		
		}
		else
		{
			return "not secure";
		}
	}
}

<<<<<<< HEAD
package july_28;

public class First_task {

	public static void main(String[] args) {
		System.out.println(printdomain("https://www.google.com/"));
		System.out.println(printdomain("http://www.gamefever.com/"));
		System.out.println(printdomain("https://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(printdomain("http://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(printdomain("https://www.javatpoint.com/java-string-substring"));

	}

	
	public static String printdomain(String address)
	{
		if (address.startsWith("https:"))
		{
			address=address.substring(8);
		}
		if (address.startsWith("http:"))
		{
			address=address.substring(7);
		}
		int index=address.indexOf("/");
		address=address.substring(0,index);
		//System.out.println("Domain is:"+address);
		return address;
	}
	
}
=======
package july_28;

public class First_task {

	public static void main(String[] args) {
		System.out.println(printdomain("https://www.google.com/"));
		System.out.println(printdomain("http://www.gamefever.com/"));
		System.out.println(printdomain("https://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(printdomain("http://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(printdomain("https://www.javatpoint.com/java-string-substring"));

	}

	
	public static String printdomain(String address)
	{
		if (address.startsWith("https:"))
		{
			address=address.substring(8);
		}
		if (address.startsWith("http:"))
		{
			address=address.substring(7);
		}
		int index=address.indexOf("/");
		address=address.substring(0,index);
		//System.out.println("Domain is:"+address);
		return address;
	}
	
}
>>>>>>> a59f3385958cfef432ace12b6429c775a95ec6c1

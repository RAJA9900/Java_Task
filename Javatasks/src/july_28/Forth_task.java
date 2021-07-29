package july_28;
import java.lang.Math;
import java.util.Scanner;

public class Forth_task {

	public static void main(String[] args) {
		System.out.println("4Calculating Hypotenuse");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.print(hypo(a,b));
		//hypo(a,b);
		sc.close();
		
		

	}
	
	public static double hypo(double a,double b)
	{
		double c=Math.sqrt(a)+Math.sqrt(b);
		return c;
		//System.out.println("The Hypotenuse is"+c);
	}

}

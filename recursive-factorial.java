// Write a program to find the factorial of given number using recursive.

import java.io.*; 

class Factorial
{
	 int fact(int n)
	{
	 	int result;
		if ( n ==1)
			return 1;
			result = fact (n-1) * n;
			return result;
	}
}
class recursive-factorial
{
	public static void main (String args[])
	{
		 String str;
		 int n; 
		Factorial f =new Factorial();
		try
		{
			BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter number whose Factorial is to be found : ");
		  	System.out.flush();
			str=obj.readLine();
			 n=Integer.parseInt(str);
			System.out.println("Factorial of is " + f.fact(n));
		}
		catch(Exception e) {}
	}
}

/*Given a string of even length, return the first half. 
So the string CatDog yields Cat. If the string length is odd number then return null.*/

import java.util.*;
class half
{
	public static String rethalf(String str)
	{
		int l=str.length();
		String str2="";
		if(l%2!=0)
			return null;
		else
		{
			char ch;
			int i;
			for(i=0;i<l/2;i++)
			{
				ch=str.charAt(i);
				str2+=ch;
			}
		}
		return str2;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println("Resulting string="+rethalf(str));
	}
}
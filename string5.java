/*Given a string, return a version without the first and last char, so "Wipro" yields "ipr". 
The string length will be at least 2.*/

import java.util.*;
class fila
{
	public static String rethalf(String str)
	{
		int l=str.length();
		if(l==2)
			return null;
		String str2="";
		char ch;
		int i;
		for(i=1;i<l-1;i++)
		{
			ch=str.charAt(i);
			str2+=ch;
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
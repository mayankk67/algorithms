/*Given a string, if the first or last chars are 'x', 
return the string without those 'x' chars, and otherwise return the string unchanged. 
If the input is "xHix", then output is "Hi".*/

import java.util.*;
class fila
{
	public static String rethalf(String str)
	{
		int l=str.length();
		char ch;
		String str2="";
		int i;
		if(str.charAt(0)!='x'||str.charAt(l-1)!='x')
			return str;
		for(i=1;i<l-1;i++)
		{
			ch=str.charAt(i);
			if(ch=='x')
				continue;
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
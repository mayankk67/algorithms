/*Return a version of the given string, 
where for every star (*) in the string the star and the chars immediately to its left and right are gone. 
So "ab*cd" yields "ad" and "ab**cd" also yields "ad".*/

import java.util.*;
class fila
{
	public static String rethalf(String str)
	{
		int l=str.length();
		char ch,ch1;
		String str2="";
		int i;
		for(i=0;i<l-1;i++)
		{
			ch=str.charAt(i);
			ch1=str.charAt(i+1);
			if(ch1=='*')
				continue;
			if(ch=='*')
			{
				i++;
				continue;
			}
			str2+=ch;
		
		}
		if(str.charAt(l-2)!='*'&&str.charAt(l-1)!='*')
			str2+=str.charAt(l-1);
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
/* Write a Program that will check whether a given String is Palindrome or not*/

import java.util.*;
class palin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str,rev="";
		int l,i;
		System.out.println("Enter a string");
		str=sc.nextLine();
		l=str.length();
		char ch;
		for(i=(l-1);i>=0;i--)
		{
			ch=str.charAt(i);
			rev+=ch;
		}
		if(str.compareTo(rev)==0)
			System.out.println(str+" is a palindrome string");
		else System.out.println(str+" is not a palindrome string");
	}
}
/*Given 2 strings, a and b, return a string of the form short+long+short, 
with the shorter string on the outside and the longer string on the inside. 
The strings will not be the same length, but they may be empty (length 0). 
If input is "hi" and "hello", then output will be "hihellohi".*/

import java.util.*;
class fila
{
	public static void rethalf(String str1,String str2,int l1,int l2)
	{
		String news=str1;
		char ch;
		int i;
		for(i=0;i<l2;i++)
		{
			ch=str2.charAt(i);
			news+=ch;
		}
		for(i=0;i<l1;i++)
		{
			ch=str1.charAt(i);
			news+=ch;
		}
		System.out.println("Resulting string is\n"+news);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		int l1,l2;
		l1=str1.length();
		l2=str2.length();
		if(l1<l2)
			rethalf(str1,str2,l1,l2);
		else rethalf(str2,str1,l2,l1);
	}
}
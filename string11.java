/* Given two strings, a and b, create a bigger string made of the first char of a, 
the first char of b, the second char of a, the second char of b, and so on. 
Any leftover chars go at the end of the result. If input is “abc” and “xyz”, then output should be “axbycz”.*/

import java.util.*;
class fila
{
	public static void rethalf(String str1,String str2,int l1,int l2)
	{
		String news="";
		char ch,ch1;
		int i,a;
		a=(l1>=l2)?l2:l1;
		for(i=0;i<a;i++)
		{
			ch=str1.charAt(i);
			ch1=str2.charAt(i);
			news+=ch;
			news+=ch1;
		}
		if(l1<l2)
			for(i=l1;i<l2;i++)
			{
				ch1=str2.charAt(i);
				news+=ch1;
			}
		else 
			for(i=l2;i<l1;i++)
			{
				ch1=str1.charAt(i);
				news+=ch1;
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
		rethalf(str1,str2,l1,l2);
	}
}
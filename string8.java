/*Given two strings, word and a separator, 
return a big string made of count occurrences of the word, separated by the separator string.
if the inputs are "Wipro","X" and 3 then the output is "WiproXWiproXWipro".*/

import java.util.*;
class fila
{
	public static void rethalf(String str1,String str2,int l1,int l2,int n)
	{
		String news=str2;
		char ch;
		int i;
		while(n--!=1)
		{
			for(i=0;i<l1;i++)
			{
				ch=str1.charAt(i);
				news+=ch;
			}
			for(i=0;i<l2;i++)
			{
				ch=str2.charAt(i);
				news+=ch;
			}
		}
		System.out.println("Resulting string is\n"+news);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		int n;
		System.out.println("Enter n");
		n=sc.nextInt();
		int l1,l2;
		l1=str1.length();
		l2=str2.length();
		if(l1<l2)
			rethalf(str1,str2,l1,l2,n);
		else rethalf(str2,str1,l2,l1,n);
	}
}
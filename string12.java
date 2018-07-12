/* Given a string and an int n, 
return a string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive. 
For example if the inputs are Wipro and 3, then the output should be propropro*/


import java.util.*;
class fila
{
	public static String rethalf(String str,int n)
	{
		int l=str.length();
		int count=1,i;
		String news="",str2="";
		for(i=l-1;count!=n+1;i--)
		{
			char ch=str.charAt(i);
			news=ch+news;
			count++;
		}
		for(i=0;i<n;i++)
		{
			str2+=news;
		}
		return str2;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.println("Resulting string="+rethalf(str,n));
	}
}
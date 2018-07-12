/*Given a string, return a new string made of n copies of the first 2 chars of the original string where n is the length of the string. 
The string may be any length. If there are fewer than 2 chars, use whatever is there.
If input is "Wipro" then output should be "WiWiWiWiWi".*/

import java.util.*;
class copies
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str1,str2="";
		System.out.println("Enter the string");
		str1=sc.nextLine();
		System.out.println("Enter number n to be repeated");
		int n=sc.nextInt();
		int l=str1.length();
		if(l==1)
		{
			while(n--!=0)
				str2=str2+str1.charAt(0);
		}
		else
			
		while(n--!=0)
		{
			str2=str2+str1.charAt(0)+str1.charAt(1);
		}
		
		System.out.println(str2);
	}
}
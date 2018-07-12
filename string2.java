/*Given two strings, append them together (known as concatenation) and return the result. 
However, if the concatenation creates a double-char, then omit one of the chars. 
If the inputs are Mark and Kate then the ouput should be markate. (The output should be in lowercase)*/

import java.util.*;
class concat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str1,str2;
		char ch;
		System.out.println("Enter string 1");
		str1=sc.nextLine();
		
		System.out.println("Enter string 2");
		str2=sc.nextLine();
		
		int l1,l2,i,count=0;
		String news="";
		
		l1=str1.length();
		l2=str2.length();
		
		news=str1;
		if(str1.charAt(l1-1)==str2.charAt(0))
			i=1;
		else i=0;
		for(;i<l2;i++)
		{
			ch=str2.charAt(i);
			news+=ch;
		}
		
		System.out.println("Concatenated string="+news);
	}
}
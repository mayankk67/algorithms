/*Given a string and a non-empty word string, 
return a string made of each char just before and just after every appearance of the word in the string. 
Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

If inputs are "abcXY123XYijk" and "XY", output should be "c13i".
If inputs are "XY123XY" and "XY", output should be "13".
If inputs are "XY1XY" and "XY", output should be "11".*/

import java.util.*;
class stee
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str1,str2;
		System.out.println("Enter the main string");
		str1=sc.nextLine();
		System.out.println("Enter the other string");
		str2=sc.nextLine();
		for(i=0;i<str1.length;i++)
		{
			


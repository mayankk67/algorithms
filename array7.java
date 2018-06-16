/*Write a program to remove the duplicate elements in an array and print
Eg) Array Elements--12,34,12,45,67,89
O/P: 12,34,45,67,89*/

import java.util.*;
class array7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of numbers:");
		int n=sc.nextInt();
		int i,j,flag=0;
		System.out.println("Enter the numbers");
		int ar[]=new int[n];
		for(i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int ar2[]=new int[n];
		ar2[0]=ar[0];
		int count=1;
		for(i=1;i<n;i++)
		{
			flag=0;
			for(j=0;j<count;j++)
			{
				if(ar2[j]==ar[i])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				ar2[count++]=ar[i];
		}
		System.out.println("Array after removal of duplicates");
		for(i=0;i<count;i++)
		{
			System.out.println(ar2[i]);
		}
	}
}
/*Write a program to initialize an array and print them in a sorted fashion*/

import java.util.*;
class array6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of numbers:");
		int n=sc.nextInt();
		int i,j;
		System.out.println("Enter the numbers");
		int ar[]=new int[n];
		for(i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted numbers are:");
		for(i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
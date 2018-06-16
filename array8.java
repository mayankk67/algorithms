/*Write a program to print the element of an array that has occurred the highest number of times
Eg) Array -> 10,20,10,30,40,100,99
O/P:10*/

import java.util.*;
class array8
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
		int max=0,elem=0;
		for(i=0;i<=n-2;i++)
		{
			int ele=ar[i];
			int count=1;
			while((ar[i+1]==ele))
			{
				count++;
				i++;
				if(i==(n-1))
					break;
			}
			if(count>max)
			{
				max=count;
				elem=ele;
			}
		}
		System.out.println("max element="+elem+"("+max+"times)");
	}
}
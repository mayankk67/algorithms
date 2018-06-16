/*Write a program to print the sum of the elements of the array with the given below condition. 
If the array has 6 and 7 in succeeding orders, ignore 6 and 7 and the numbers between them for the calculation of sum.
Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]
Eg2) Array Elements - 7,1,2,3,6
O/P:19
Eg3) Array Elements - 1,6,4,7,9
O/P:10*/

import java.util.*;
class array9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of numbers:");
		int n=sc.nextInt();
		int i,j;
		System.out.println("Enter the numbers");
		int ar[]=new int[n];
		int flag=0,pos=0,sum=0;
		for(i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(ar[i]==6)
			{
				pos=i;
				flag=1;
			}
			if(ar[i]==7&&flag==1)
			{
				flag=0;
				i++;
			}
			if(flag==0)
				sum=sum+ar[i];
		}
		if(flag==1)
			for(i=pos;i<n;i++)
				sum+=ar[i];
		System.out.println(sum);
	}
}
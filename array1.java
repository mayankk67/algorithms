/*Write a program to initialize an integer array and print the sum and average of the array*/

class array1
{
	public static void main(String args[])
	{
		int ar[]={1,3,4,2,63,32,34,62,34,2,132};
		int l=ar.length;
		int sum=0,avg,i;
		for(i=0;i<l;i++)
		{
			sum+=ar[i];
		}
		avg=sum/l;
		System.out.println(sum+" "+avg);
	}
}
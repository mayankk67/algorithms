/*Write a program to initialize an integer array and find the maximum and minimum value of an array*/

class array2
{
	public static void main(String args[])
	{
		int ar[]={1,3,4,2,63,32,34,62,34,2,132};
		int l=ar.length;
		int max=0,min=ar[0],i;
		for(i=0;i<l;i++)
		{
			if(ar[i]>max)
				max=ar[i];
			if(ar[i]<min)
				min=ar[i];
		}
		System.out.println("Max value="+max+"\nMin value="+min);
	}
}
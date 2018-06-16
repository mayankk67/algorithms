/* Initialize an integer array with ascii values and print the corresponding character values in a single row.*/

class array4
{
	public static void main(String args[])
	{
		int ar[]={17,44,34,56,74};
		char ch;
		int i;
		for(i=0;i<ar.length;i++)
		{
			ch=(char)ar[i];
			System.out.println(ch);
		}
	}
}
			
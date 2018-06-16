/*Write a program to find greatest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.


Example1:

     C:\>java Sample 1 2 3

     O/P Expected : Please enter 9 integer numbers

Example2:

     C:\>java Sample 1 23 45 55 121 222 56 77 89

     O/P Expected : 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222*/

class array11
{
	public static void main(String args[])
	{
		try
		{
			int ar[][]=new int[3][3];
			int i,j,count=0,max=0;
			for(i=0;i<3;i++)
				for(j=0;j<3;j++)
				{
					ar[i][j]=Integer.parseInt(args[count++]);
					if(ar[i][j]>max)
						max=ar[i][j];
				}
			System.out.println("The given array is :");
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
					System.out.print(ar[i][j]+" ");
				System.out.println();
			}
			System.out.println("The biggest number in the given array is "+max);
		}
		catch(Exception e)
		{
			System.out.println("Please enter 9 integers!");
		}
	}
}
			
			
/*Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

Example1:

     C:\>java Sample 1 2 3

     O/P Expected : Please enter 4 integer numbers

Example2:

     C:\>java Sample 1 2 3 4

     O/P Expected : 
     
  The given array is :
  1 2 
  3 4 
  The reverse of the array is :
  4 3 
  2 1

1       2         3       4
5       6         7       8
9       10       11     12*/

class array10
{
	public static void main(String args[])
	{
		try
		{
			int ar[][]=new int[2][2];
			int i,j,count=0;
			for(i=0;i<2;i++)
				for(j=0;j<2;j++)
					ar[i][j]=Integer.parseInt(args[count++]);
			System.out.println("The given array is :");
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
					System.out.print(ar[i][j]+"\t");
				System.out.println();
			}
			System.out.println("The reverse of the array is :");
			for(i=1;i>=0;i--)
			{
				for(j=1;j>=0;j--)
					System.out.print(ar[i][j]+"\t");
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println("Please enter 4 integers!");
		}
	}
}
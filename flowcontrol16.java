/*Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *



Example1:

     C:\>java Sample 

     O/P Expected : Please enter an integer number

Example1:

     C:\>java Sample 3

     O/P Expected :
                   *
                   *  * 
                   *  *  *
*/

class flowcontrol16
{
	public static void main(String args[])
	{
		try
		{
		int num=Integer.parseInt(args[0]);
		for(int i=0;i<num;i++)
			{
			for(int j=0;j<=i;j++)
				System.out.print("*");
			System.out.println("");
			}
		}catch(Exception e)
		{
			System.out.println("Please input an integer");
		}
	}
}
		
				   
				   
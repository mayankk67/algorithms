/*Write a Program to accept two integers through the command line 
argument and print the sum of the two numbers

Example:

     C:\>java Sample 10 20

     O/P Expected : The sum of 10 and 20 is 30
Write a Program to accept two integers through the command line 
argument and print the sum of the two numbers

Example:

     C:\>java Sample 10 20

     O/P Expected : The sum of 10 and 20 is 30*/

class languagebasic3
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
	}
}
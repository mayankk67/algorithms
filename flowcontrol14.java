/* Write a Java program to find if the given number is prime or not.

Example1:

     C:\>java Sample 

     O/P Expected : Please enter an integer number 

Example2:

     C:\>java Sample 1

     O/P Expected : 1 is neither prime nor composite

Example3:

     C:\>java Sample 0

     O/P Expected : 0 is neither prime nor composite
 
 Example4:

     C:\>java Sample 10

     O/P Expected : 10 is not a prime number

Example5:

     C:\>java Sample 7

     O/P Expected : 7 is a prime number*/
	 
class flowcontrol14
{
	public static int isprime(int num)
	{
		int flag=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args)
	{
		try
		{
			int num=Integer.parseInt(args[0]);
			if(num==1||num==0)
				System.out.println(num+" is neither prime nor composite");
			else if(isprime(num)==1)
				System.out.println(num+" is a prime number");
			else System.out.println(num+" is not a prime number");
		}catch(Exception e)
		{
			System.out.println("Please input an integer");
		}
	}
}
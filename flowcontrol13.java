/*Write a program to print prime numbers between 10 and 99.*/

class flowcontrol13
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
	public static void main(String args[])
	{
		for(int i=10;i<100;i++)
		{
			if(isprime(i)==1)
				System.out.println(i);
		}
	}
}
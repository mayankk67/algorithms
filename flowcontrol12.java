/* Write a program to check if a given number is prime or not*/

class flowcontrol12
{
	public static void main(String[] args)
	{
		int num=Integer.parseInt(args[0]);
		int flag=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Prime");
		else System.out.println("Not Prime");
	}
}
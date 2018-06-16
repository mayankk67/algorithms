/* Write a program to add all the values in a given number and print. Ex: 1234->10*/

class flowcontrol15
{
	public static void main(String args[])
	{
		try
		{
		int num=Integer.parseInt(args[0]);
		int sum=0;
		while(num!=0)
		{
			int dig=num%10;
			sum+=dig;
			num=num/10;
		}
		System.out.println(sum);
		}catch(Exception e)
		{
			System.out.println("Please input an integer");
		}
	}
}
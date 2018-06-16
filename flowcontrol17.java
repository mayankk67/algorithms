/*Write a program to reverse a given number and print
Eg1)
I/P: 1234
O/P:4321
Eg2)
I/P:1004
O/P:4001*/

class flowcontrol17
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
			sum=sum*10+dig;
			num=num/10;
		}
		System.out.println(sum);
		}catch(Exception e)
		{
			System.out.println("Please input an integer");
		}
	}
}
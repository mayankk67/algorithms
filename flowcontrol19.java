/*Write a program to print first 5 values which are divisible by 2, 3, and 5.*/

class flowcontrol19
{
	public static void main(String args[])
	{
		int i=1,count=1;
		while(count<=5)
		{
			if(i%2==0&&i%3==0&&i%5==0)
			{
				System.out.println(i);
				i++;
				count++;
				continue;
			}
			i++;
		}
	}
}
		
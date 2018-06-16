/*Write a Java program to find if the given number is palindrome or not

Example1:

     C:\>java Sample 110011

     O/P Expected : 110011 is a palindrome

Example2:

     C:\>java Sample 1234

     O/P Expected : 1234 is not a palindrome*/
	 
class flowcontrol18
{
	public static void main(String args[])
	{
		try
		{
		int num=Integer.parseInt(args[0]);
		int dup=num;
		int sum=0;
		while(num!=0)
		{
			int dig=num%10;
			sum=sum*10+dig;
			num=num/10;
		}
		if(dup==sum)
			System.out.println(dup+" is a palindrome");
		else System.out.println(dup+" is not a palindrome");
		}catch(Exception e)
		{
			System.out.println("Please input an integer");
		}
	}
}
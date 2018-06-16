/* Write a program to check if a given number is odd or even.*/
class flowcontrol2
{
	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		if(a%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
	}
}
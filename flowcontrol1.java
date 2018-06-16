/*Write a program to check if a given number is Positive, Negative, or Zero.*/

class flowcontrol1
{
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		if(n<0)
			System.out.println("negative number");
		else if(n>0)
			System.out.println("Positive number");
		else System.out.println("Zero");
	}
}
/*Write a program that displays a menu with options 
1. Add 
2. Sub
Based on the options chosen, read 2 numbers and perform the relevant operation. 
After performing the operation, the program should ask the user if he wants to continue. 
If the user presses y or Y, then the program should continue displaying the menu else the program should terminate.
[ Note: Use Scanner class, you can take help from the trainer regarding the same ]*/

import java.util.*;
class flowcontrol20
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char str;
		do
		{
			System.out.println("Enter 1 for adding, Enter 2 for subtraction");
			int ch,a,b;
			ch=sc.nextInt();
			System.out.println("Enter 2 numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			switch(ch)
			{
				case 1: System.out.println(a+b);
				break;
				
				case 2: System.out.println(a-b);
				break;
				
				default: break;
			}
			
			System.out.println("Press y or Y to continue");
			str=sc.next().charAt(0);
		}while(str=='y'||str=='Y');
	}
}
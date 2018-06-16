/*Write a program to print month in words, based on input month in numbers
Example1:

     C:\>java Sample 12

     O/P Expected : December

Example2:

     C:\>java Sample 

     O/P Expected : Please enter the month in numbers

Example3:

     C:\>java Sample 15

     O/P Expected : Invalid month*/

class flowcontrol9
{
	public static void main(String[] args)
	{
		try
		{
			int ch=Integer.parseInt(args[0]);
			String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
			switch(ch)
			{
				case 1: System.out.println(month[0]);break;
				case 2: System.out.println(month[1]);break;
				case 3: System.out.println(month[2]);break;
				case 4: System.out.println(month[3]);break;
				case 5: System.out.println(month[4]);break;
				case 6: System.out.println(month[5]);break;
				case 7: System.out.println(month[6]);break;
				case 8: System.out.println(month[7]);break;
				case 9: System.out.println(month[8]);break;
				case 10: System.out.println(month[9]);break;
				case 11: System.out.println(month[10]);break;
				case 12: System.out.println(month[11]);break;
				default: System.out.println("Invalid month");
			}
		}catch(Exception e)
		{
			System.out.println("Please enter the month in numbers");
		}
	}
}	
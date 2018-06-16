 /*Write a Program to accept a String as a Command line argument and the program should print a Welcome message.

Example :

     C:\> java Sample John
    
      O/P Expected : Welcome John*/

class languagebasic2
{
	public static void main(String[] args) 
	{
		String str1;
		str1=args[0];
		System.out.println("Hello "+str1);
	}
}
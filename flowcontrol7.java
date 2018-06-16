/*Write a program to convert from upper case to lower case 
and vice versa of an alphabet and print the old character 
and new character as shown in example (Ex: a->A, M->m).*/

class flowcontrol7
{
	public static void main(String args[])
	{
		char ch1='a',ch2='M';
		if (ch1>=65&&ch1<=90)
			System.out.println(ch1+"->"+(char)(ch1+32));
		else if (ch1>=97&&ch1<=122)
			System.out.println(ch1+"->"+(char)(ch1-32));
		if (ch2>=65&&ch2<=90)
			System.out.println(ch2+"->"+(char)(ch2+32));
		else if (ch2>=97&&ch2<=122)
			System.out.println(ch2+"->"+(char)(ch2-32));
	}
}
/*
Intialize a character variable in a program and if the value is alphabet then print "Alphabet" if it’s a number then print "Digit" and for other characters print "Special Character"*/

class flowcontrol5
{
	public static void main(String args[])
	{
		int ch='@';
		if ((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
			System.out.println("Alphabet");
		else if(ch<=57&&ch>=48)
			System.out.println("Digit");
		else 
			System.out.println("Special character");
	}
}

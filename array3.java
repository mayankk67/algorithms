/*Write a program to initialize an integer array with values and check if a given number is present in the array or not. If the number is not found, it will print -1 else it will print the index value of the given  number in the array
Ex1) Array elements are  {1,4,34,56,7} and the search element is 90
O/P: -1
Ex2)Array elements are  {1,4,34,56,7} and the search element is 56
O/P: 4 */

class array3
{
	public static void main(String args[])
	{
		int ar[]={1,4,34,56,7};
		int ele=4;
		int l=ar.length;
		int i=0,pos=-1;
		while(i!=l)
		{
			if(ar[i]==ele)
			{
				pos=i+1;
				break;
			}
			i++;
		}
		System.out.println(pos);
	}
}
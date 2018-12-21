package com_revature.example;

public class CodeChallengeWed 
{

	public static void main(String[] args) 
	{
	    String home = "string";
		
		reverse(args[0]);

	}
	
	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 *
	 * @param string
	 * @return
	 */
	public String reverse(String home) 
	{
		int length = home.length();
		char[] array = new char[length];
		char[] charArray = home.toCharArray();
		int i = 0;
		for(int l = length-1; 1 >= 0; l--)
		{
			array[i] = charArray[l];
			i++;
		}
		
		String reversestr = new String(array);
		return reversestr;
	}
	

}

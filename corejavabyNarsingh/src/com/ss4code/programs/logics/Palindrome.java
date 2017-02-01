package com.ss4code.programs.logics;

public class Palindrome {
	public static void palindrome(String value) {
		String reverseVal = "";

		for (int i = value.length() - 1; i >= 0; i--) {
			reverseVal = reverseVal + value.charAt(i);

		}
		if (value.equals(reverseVal)) {

			System.out.println("palindrome");

		}

		else

		{

			System.out.println("not a palindrome");

		}

	}

	public static void main(String[] args) 
	{
		palindrome("madam");

	}

}

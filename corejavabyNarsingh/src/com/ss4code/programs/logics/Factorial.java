package com.ss4code.programs.logics;

public class Factorial 
{
	
	public static int factorialValue(int number)
	{
		int factorialValue=1;
		
		for(int i=1;i<=number;i++)
			factorialValue=factorialValue*i;
		
		
		return factorialValue;
	}
	
	public static void main(String[] args) 
	{
		int factValue=factorialValue(6);
		System.out.println(factValue);
		
	}

}

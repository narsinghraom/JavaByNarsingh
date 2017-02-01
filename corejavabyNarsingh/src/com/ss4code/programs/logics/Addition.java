package com.ss4code.programs.logics;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// adding values with only one variable
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a and b vales");
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=1;i<=b;i++)
		{
			a++;
		}
		System.out.println("Addition is " +a);

	}

}
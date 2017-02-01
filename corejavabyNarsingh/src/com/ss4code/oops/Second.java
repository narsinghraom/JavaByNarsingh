package com.ss4code.oops;

public class Second extends First implements Xyz
{
	int i=6;
	int j=i;
	public int function(int a)
	{
		System.out.println("second class");
		this.a=a+a;
		
		b=this.a;
		return a+this.b;
		
	}
	public int function(int a,int b)
	{
		
		this.a=a;
		this.b=b;
		return this.a+this.b;
	}
	
	public static void main(String[] args) 
	{
		First first=new First();
		first.function(2);
		//first.function(2, 4);
		
		Abc abc=new Second();
		abc.function(2);
		System.out.println(abc.i);
		//System.out.println(abc.j);
		First f1=new Second();
		System.out.println(f1.i);
		
		//System.out.println(f1.j);
		
		Abc a1=new First();
		
	}
	

}

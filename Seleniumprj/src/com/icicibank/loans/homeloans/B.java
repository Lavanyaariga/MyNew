package com.icicibank.loans.homeloans;


public strictfp class B
{
	static B b;
	int a=10; //instance or global or non static  primitive variables
	static float f=12.45f;
	
	public void m1()
	{
		int a=20;
		System.out.println("Hi iam m1 method from class B  :" + this.a);
	}
	
	public static void m2()
	{
		b=new B();
		System.out.println("Hi iam m1 method from class B  :" + b.a);
	}
	
	public static void main(String[] args) 
	{
		b=new B();
		System.out.println(b.a);
		b.m1();
		System.out.println(f);
	
	}
	
}

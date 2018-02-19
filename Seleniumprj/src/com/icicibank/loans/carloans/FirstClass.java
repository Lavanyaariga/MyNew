package com.icicibank.loans.carloans;

public class FirstClass implements FirstInterface
{
	int a=10,b=20,result;
	
	public void addition()
	{
		result=a+b;
		System.out.println("Addition of A & B are :" + result);
	}
	

	public static void main(String[] args) 
	{
		System.out.println("Hi welcome to selenium...");
		FirstClass obj=new FirstClass();
		obj.addition();
		obj.m1();
		
		FirstClass obj1=new FirstClass();
		obj1.addition();
		obj1.m1();
	}


	@Override
	public void m1() 
	{
		// TODO Auto-generated method stub
		System.out.println("Hi iam overidden m1 method in FirstClass");
	}

}

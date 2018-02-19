package com.icicibank.loans.carloans;

import com.icicibank.loans.homeloans.B;

public class ChildClass extends B
{
	public void m2()
	{
		System.out.println("Hi iam m2 method from class ChildClass");
	}
	
	public static void main(String[] args) 
	{
		ChildClass c=new ChildClass();
		c.m2();
		c.m1();
	}

}

package org.bank2;

import java.util.Scanner;

public class AxisBank extends BankInfo{
	static Scanner sc = new Scanner(System.in);
	
	public void deposit(long depositAmount,int depositYear) {
		 float b=sc.nextFloat();
		 int c=sc.nextInt();
		 double a= b/c;
		double ret = (double)(a * (depositAmount));
	
		float total=(float) (ret+depositAmount);
	
		System.out.println("Amount to deposit      :"+depositAmount);
		System.out.println("No of years of deposit :"+depositYear);
		System.out.println("Enter the b value      :"+b);
		System.out.println("Eater the c value      :"+c);
		System.out.println("Returns  amount wil be 33%of principle +actual principle amount: "+ total);
		
		
	}
	
	public static void main(String[] args) {
		
		
		
		long depositAmount = sc.nextLong();
		int depositYear = sc.nextInt();
		
		AxisBank a = new AxisBank();
		
		a.deposit(depositAmount, depositYear);
	}
	
}

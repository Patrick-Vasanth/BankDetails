package org.bank2;

import java.util.Scanner;

public class BankInfo {

	public void savings() {
		 
		System.out.println("Start a savings account for your future.");
	}
	public void fixed() {
		
		System.out.println("Here we have a more intrest rate in our FDs.");
	}
	public void deposit(long depositAmount,int depositYear) {
		
		System.out.println("Amount to deposit      :"+depositAmount);
		System.out.println("No of years of deposit :"+depositYear);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long depositAmount = sc.nextLong();
		int depositYear = sc.nextInt();
		
		BankInfo b = new BankInfo();
		b.savings();
		b.fixed();
		b.deposit(depositAmount, depositYear);
	}
}

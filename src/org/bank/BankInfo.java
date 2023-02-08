package org.bank;

public class BankInfo extends AxisBank{

	public void saving() {
		System.out.println("____SAVING____");
		System.out.println("Savings account can be open to everyone who age is above 14 ,if minor means joint account.");
	}
	public void fixed() {
		System.out.println("____FIXED____");
		System.out.println("We are having a great returns intrest rates for your money the best FD rates in our bank is 8.5%.");
	}
    public static void main(String[] args) {
		
    	BankInfo b = new BankInfo();
    	b.deposit();
    	b.saving();
    	b.fixed();
	}
}

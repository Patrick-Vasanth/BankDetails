package org.bank1;

public class Heirarichal extends AxisBank {

	public void acctHolderName() {
		System.out.println("J.Paqtrick");
	}
	public void acctHolderAddress() {
		System.out.println("Tuticorin");
	}
	public static void main(String[] args) {
		
		Heirarichal h = new Heirarichal();
		h.acctHolderName();
		h.acctHolderAddress();
		h.deposit();
	}
}

package org.sample;

public class CitiBank extends HDFCBank {

	@Override
	public void savings() {
		System.out.println("CitiBank savings interest is 9%");
		
	}

	@Override
	public void deposit() {
		System.out.println("CitiBank deposit interest is 11%");
		
	}
	public static void main(String[] args) {
		CitiBank a = new CitiBank();
		a.savings();
		a.deposit();
		a.fixed();
	}

}

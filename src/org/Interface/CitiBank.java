package org.Interface;

public class CitiBank implements AxisBank {

	@Override
	public void savings() {
		this.deposit();
		System.out.println("Citi savings 7%");
		
	}

	@Override
	public void deposit() {
		this.fixed();
		System.out.println("Citi deposit 10%");
		
	}

	@Override
	public void fixed() {
		System.out.println("Citi fixed 12%");
		
	}
	public static void main(String[] args) {
		CitiBank b = new CitiBank();
		b.savings();
		
	}

}

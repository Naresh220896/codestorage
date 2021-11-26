package org.sample;

public abstract class HDFCBank {
	// abstract methods
	public abstract void savings();
	
	public abstract void deposit();
		
    // non abstract methods
	public void fixed() {
		System.out.println("HDFCBank Fixed interest rate is 9%");

	}
	
	}



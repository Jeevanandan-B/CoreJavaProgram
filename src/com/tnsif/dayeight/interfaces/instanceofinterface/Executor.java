package com.tnsif.dayeight.interfaces.instanceofinterface;

public class Executor {

	public static void main(String[] args) {
		
		Phone p1 = PhoneFactory.createPhone("Samsunng");
		p1.call();
		p1.sms();
		
		p1 = PhoneFactory.createPhone("Jio");
		p1.call();
		p1.sms();
	}

}

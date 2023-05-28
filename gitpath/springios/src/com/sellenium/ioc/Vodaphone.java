package com.sellenium.ioc;

public class Vodaphone implements Sim{

	@Override
	public void calling() {
		System.out.println("calling using vodaphone sim");
		
	}

	@Override
	public void data() {
		System.out.println("browsing data from vodaphone sim");
		
	}

}

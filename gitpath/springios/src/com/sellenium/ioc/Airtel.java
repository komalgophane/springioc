package com.sellenium.ioc;

public class Airtel implements Sim{
	
	public Airtel(){
		System.out.println("airtel constructor calling");
	}

	@Override
	public void calling() {
		System.out.println("calling using airtel sim");
		
	}

	@Override
	public void data() {
		System.out.println("browsing data from airtel sim");
		
	}

}

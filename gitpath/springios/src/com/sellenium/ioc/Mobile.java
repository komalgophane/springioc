package com.sellenium.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {

		/*
		 * Sim sim = new Airtel(); sim.calling(); sim.data();
		 */

		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		Sim sim = context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
	}

}

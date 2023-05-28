package com.sellenium.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Connection con = context.getBean("connectionObj",Connection.class);
		con.displayconnection();

	}

}

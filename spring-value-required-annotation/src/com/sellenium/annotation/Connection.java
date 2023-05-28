package com.sellenium.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Connection {

	@Autowired
	private JDBCConnection jdbcConnection;

	/*
	 * public Connection() {
	 * 
	 * System.out.println("inside defauly constructor of Connection class"); }
	 * 
	 * public Connection(JDBCConnection jdbcConnection) { this.jdbcConnection =
	 * jdbcConnection;
	 * System.out.println("inside parameterized constructor  of Connection classs "
	 * ); }
	 */

	/*
	 * public void setJdbcConnection(JDBCConnection jdbcConnection) {
	 * this.jdbcConnection = jdbcConnection;
	 * System.out.println("inside setter method of Connection classs "); }
	 */

	public void displayconnection() {
		jdbcConnection.display();
	}

}

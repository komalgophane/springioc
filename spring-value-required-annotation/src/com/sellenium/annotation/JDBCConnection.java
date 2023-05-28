package com.sellenium.annotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {

	@Value("${jdbcconnection.url}")
	private String url;

	@Value("${jdbcconnection.userName}")
	private String userName;

	@Value("${jdbcconnection.password}")
	private String password;

	@Value("${jdbcconnection.driver}")
	private String driver;

	/*
	 * public JDBCConnection() {
	 * 
	 * }
	 * 
	 * public JDBCConnection(String url, String userName, String password, String
	 * driver) { this.url = url; this.userName = userName; this.password = password;
	 * this.driver = driver; }
	 */

	/*
	 * public String getUrl() { return url; }
	 * 
	 * @Value("${jdbcconnection.url}") //@Required // @Required is depricated from
	 * spring public void setUrl(String url) { this.url = url; }
	 * 
	 * public String getUserName() { return userName; }
	 * 
	 * @Value("${jdbcconnection.userName}") public void setUserName(String userName)
	 * { this.userName = userName; }
	 * 
	 * public String getPassword() { return password; }
	 * 
	 * @Value("${jdbcconnection.password}") public void setPassword(String password)
	 * { this.password = password; }
	 * 
	 * public String getDriver() { return driver; }
	 * 
	 * @Value("${jdbcconnection.driver}") public void setDriver(String driver) {
	 * this.driver = driver; }
	 */

	public void display() {
		System.out.println("url : " + url);
		System.out.println("userName : " + userName);
		System.out.println("password : " + password);
		System.out.println("driver : " + driver);
	}
}

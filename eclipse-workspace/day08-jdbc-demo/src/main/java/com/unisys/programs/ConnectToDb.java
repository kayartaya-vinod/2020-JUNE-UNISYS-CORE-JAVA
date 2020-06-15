package com.unisys.programs;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class ConnectToDb {

	// https://mvnrepository.com:443/artifact
	// http://mvnrepository.com:80/artifact
	// <scheme>://<server>[:<port>][/<resource>]
	// jdbc:h2:tcp://localhost/~/trainingdb
	// jdbc:mysql://localhost:3306/trainingdb
	// jdbc:oracle:thin:@localhost:1521:ORCL
	// jdbc:mssql://localhost:1433/trainingdb
	
	public static void main(String[] args) throws Exception {
		String url = "jdbc:h2:tcp://localhost/~/trainingdb"; // discriminator for the factory function in DriverManager class
		String user = "root";
		String password = "Welcome#123";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println("Got a connection of type: " + conn.getClass());
		listRegieteredDrivers() ;
		
	}
	
	public static void listRegieteredDrivers() {
		
		// Class.forName("org.h2.Driver");
		Enumeration<Driver> drivers = DriverManager.getDrivers();
		
		System.out.println("Following driver objects found with DriverManager!");
		while(drivers.hasMoreElements()) {
			Driver driver = drivers.nextElement();
			System.out.println(driver.getClass());
		}

	}
}

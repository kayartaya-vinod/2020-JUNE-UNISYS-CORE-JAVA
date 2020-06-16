package com.unisys.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public final class DbUtil {

	private DbUtil() {
	}
	
	public static Connection createConnection() throws SQLException, ClassNotFoundException {
		ResourceBundle rb = ResourceBundle.getBundle("jdbc");
		Class.forName(rb.getString("jdbc.dirverClassName"));
		String url = rb.getString("jdbc.url");
		String user = rb.getString("jdbc.user");
		String password = rb.getString("jdbc.password");
		return DriverManager.getConnection(url, user, password);
	}
}

package com.unisys.programs;

import com.unisys.utils.KeyboardUtil;

public class SqlInjectionSimulation {

	public static void main(String[] args) {
		String username = KeyboardUtil.getString("Enter username: ");
		String password = KeyboardUtil.getString("Enter password: ");
		
		String sql = String.format("select * from users where username='%s' and password='%s'", username, password);
		System.out.println(sql);
		
	}
}

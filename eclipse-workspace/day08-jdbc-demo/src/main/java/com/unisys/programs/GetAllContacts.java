package com.unisys.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.unisys.utils.DbUtil;

public class GetAllContacts {

	public static void main(String[] args) throws Exception {
		String sql = "select * from contacts";

		try (Connection conn = DbUtil.createConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();) {
			
			while (rs.next()) {
				String name = rs.getString("firstname") + " " + rs.getString("lastname");
				String email = rs.getString("email"); // rs.getString(4);
				String phone = rs.getString("phone");
				String city = rs.getString("city");
				System.out.printf("%-20s %-30s %-15s %-20s\n", name, email, phone, city);
			}
			
			
		}

	}

}

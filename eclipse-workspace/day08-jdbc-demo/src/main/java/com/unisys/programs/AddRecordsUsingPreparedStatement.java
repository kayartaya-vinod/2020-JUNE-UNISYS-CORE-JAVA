package com.unisys.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.unisys.utils.DbUtil;
import com.unisys.utils.KeyboardUtil;

public class AddRecordsUsingPreparedStatement {

	public static void main(String[] args) {
		String sql = "insert into contacts(firstname, lastname, email, phone) values (?,?,?,?)";
		
		try(Connection conn = DbUtil.createConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);) {
			while(true) {
				String fname = KeyboardUtil.getString("Enter frstname: ");
				String lname = KeyboardUtil.getString("Enter lastname: ");
				String email = KeyboardUtil.getString("Enter email id: ");
				String phone = KeyboardUtil.getString("Enter phone#  : ");
				
				stmt.setString(1, fname);
				stmt.setString(2, lname);
				stmt.setString(3, email);
				stmt.setString(4, phone);
				
				stmt.executeUpdate();
				
				System.out.println("Data inserted to DB!");
				String choice = KeyboardUtil.getString("Do you want add one more? yes/no (yes) : ");
				if(choice.equalsIgnoreCase("no")) break;
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Thank you!");
	}

}

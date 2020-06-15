package com.unisys.programs;

import java.sql.Connection;
import java.sql.Statement;

import com.unisys.utils.DbUtil;
import com.unisys.utils.KeyboardUtil;

public class AddRecordsUsingStatement {

	public static void main(String[] args) {
		
		try(Connection conn = DbUtil.createConnection();
				Statement stmt = conn.createStatement();) {
			while(true) {
				String fname = KeyboardUtil.getString("Enter frstname: ");
				String lname = KeyboardUtil.getString("Enter lastname: ");
				String email = KeyboardUtil.getString("Enter email id: ");
				String phone = KeyboardUtil.getString("Enter phone#  : ");
				
				String sql = String.format(
						"insert into contacts(firstname, lastname, email, phone) values ('%s', '%s', '%s', '%s')",
						fname, lname, email, phone);
				
				stmt.executeUpdate(sql);
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

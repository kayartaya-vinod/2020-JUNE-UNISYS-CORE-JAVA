package com.unisys.programs;

import java.sql.Connection;
import java.sql.Statement;

import com.unisys.utils.DbUtil;

public class CreateTable {

	public static void main(String[] args) {

		String sql = "create table contacts (\n" + 
				"    id int primary key auto_increment,\n" + 
				"    firstname varchar(30) not null,\n" + 
				"    lastname varchar(30),\n" + 
				"    email varchar(50) unique,\n" + 
				"    phone varchar(15) unique,\n" + 
				"    city varchar(20) default 'Bangalore'\n" + 
				")";
		
		try(
			Connection conn = DbUtil.createConnection();
			Statement stmt = conn.createStatement();
		) {
			stmt.execute(sql);
			System.out.println("Table created successfully!");
		}
		catch(Exception ex) {
			// ex.printStackTrace();
			System.out.println("OOPS! There was an erro while creating table");
			System.out.println("Server message: " + ex.getMessage());
		}
		
		
	}

}

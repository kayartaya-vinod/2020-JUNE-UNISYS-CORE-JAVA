package com.unisys.programs;

import java.io.FileReader;
import java.sql.Connection;
import java.util.Date;

class HelloUnisys {}

public class UsingPrimitives {

	Date today;
	Connection conn;
	FileReader fr;
	
	public static void main(String[] args) {
		
		// f is a primitive
		float f =  123.45f;
		
		// name is a reference (8 bytes in a 64bit java)
		String name = "Vinod";
		
		
//		Math m;
//		System s;
//		
//		m = new Math();
//		s = new System();
	}
}


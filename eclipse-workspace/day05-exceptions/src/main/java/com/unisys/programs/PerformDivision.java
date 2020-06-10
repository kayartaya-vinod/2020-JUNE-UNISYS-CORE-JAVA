package com.unisys.programs;

public class PerformDivision {
	
	// Wrapper classes
	// byte --> java.lang.Byte
	// short --> java.lang.Short
	// int --> java.lang.Integer
	// long --> java.lang.Long
	// float --> java.lang.Float
	// double --> java.lang.Double
	// char --> java.lang.Character
	// boolean --> java.lang.Boolean

	public static void main(String[] args) {

		System.out.println("Performing division on ...");
		// java com.unisys.programs.PerformDivision 100 22
		
		int num, den;
		num = Integer.parseInt(args[0]);
		den = Integer.parseInt(args[1]);
		
		int quotient = num / den;
		
		System.out.printf("Quotient of %d / %d is %d\n", num, den, quotient);
		
		System.out.println("End of main()");
	}

}

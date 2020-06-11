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
		
		try {
			int num, den;
			num = Integer.parseInt(args[0]);
			den = Integer.parseInt(args[1]);
			
			int quotient = num / den;
			
			System.out.printf("Quotient of %d / %d is %d\n", num, den, quotient);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("Please retry with two integers!");
		} catch(ArithmeticException e) {
			System.out.println("Sorry, cannot divide an integer by zero!");
		} catch(Exception e) {
			System.out.println("Unknown error - " + e.getMessage());
		}
		
		System.out.println("End of main()");
	}

	public static void main_old(String[] args) {
		
		System.out.println("Performing division on ...");
		// java com.unisys.programs.PerformDivision 100 22
		
		try {
			int num, den;
			num = Integer.parseInt(args[0]);
			den = Integer.parseInt(args[1]);
			
			int quotient = num / den;
			
			System.out.printf("Quotient of %d / %d is %d\n", num, den, quotient);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Hey, you should try executing this with at least 2 integers.");
		} catch(NumberFormatException e) {
			System.out.println("Hey, did you try this with non-numeric values? This works only with integers!");
		} catch(ArithmeticException e) {
			System.out.println("Sorry, cannot divide an integer by zero!");
		} catch(Exception e) {
			System.out.println("Unknown error - " + e.getMessage());
		} finally {
			System.out.println("From inside of finally");
		}
		
		System.out.println("End of main()");
	}

}

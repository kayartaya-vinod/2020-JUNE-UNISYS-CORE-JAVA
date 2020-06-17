package com.unisys.programs;

import com.unisys.tasks.ImportCsvData;

public class CreateThreads {


	public static void main(String[] args) {
		System.out.println("Start of main()");
		Thread t1 = new ImportCsvData();
		System.out.println("New thread of type ImportCsvData created");
		System.out.println("Calling the run() method...");
		// t1.run();
		t1.start();
		System.out.println("Back in main()");
		System.out.println("End of main()");
	}
}

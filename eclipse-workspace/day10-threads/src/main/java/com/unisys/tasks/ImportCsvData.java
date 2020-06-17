package com.unisys.tasks;

public class ImportCsvData extends Thread {

	String filename;

	public ImportCsvData() {
	}

	public ImportCsvData(String filename) {
		this.filename = filename;
	}

	public void writeToTable(int i) {
		System.out.printf("Writing row %d to table\n", i, filename);
	}
	
	public void readFromCsv() {
		// logic for reading CSV file and
		// writing the same into the DB

		for (var i = 0; i < 100; i++) {
			System.out.printf("Reading row %d from file %s\n", i, filename);
			writeToTable(i);
		}
	}

	@Override
	public void run() {
		readFromCsv();
	}

}

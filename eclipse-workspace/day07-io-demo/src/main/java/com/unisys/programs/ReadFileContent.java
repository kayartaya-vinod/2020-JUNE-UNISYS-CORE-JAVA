package com.unisys.programs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class ReadFileContent {
	static String filename = "pom.xml";

	public static void main(String[] args) throws Exception {
		// readUsingFileReader();
		// readFileByLine();
		readFullFile();
	}
	
	public static void readFullFile() throws Exception {
		try(
			FileInputStream in = new FileInputStream(filename);
		) {
			int size = in.available();
			byte[] bytes = new byte[size];
			in.read(bytes);
			String content = new String(bytes);
			System.out.println(content);
		}
	}
	
	public static void readFileByLine() {
		try (
			FileReader reader = new FileReader(filename);
			BufferedReader in = new BufferedReader(reader);
		) {
			String line;
			int pass = 0;
			while((line=in.readLine())!=null) {
				System.out.println(line);
				pass++;
			}
			System.out.println("Total no.of passes = " + pass);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void readUsingFileReader() {
		try (FileReader reader = new FileReader(filename);) {
			int ch;
			int pass = 0;
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);
				pass++;
			}
			System.out.println("Total no.of passes = " + pass);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void readUsingFileInputStream() {

		try (FileInputStream file = new FileInputStream(filename);) {
			int ch;
			while ((ch = file.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

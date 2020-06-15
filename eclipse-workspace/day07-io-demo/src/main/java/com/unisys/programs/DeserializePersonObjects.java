package com.unisys.programs;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.unisys.entity.Person;

public class DeserializePersonObjects {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("people.data");
		ObjectInputStream in = new ObjectInputStream(file);
		
		while (true) {
			try {
				Person p1 = (Person) in.readObject();
				System.out.println(p1);
			} catch (EOFException e) {
				break;
			}
		}
		
		in.close();
		file.close();
		
	}
}

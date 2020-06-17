package com.unisys.programs;

import java.util.Vector;

public class ThreadsSharingData {

	public static void main(String[] args) throws InterruptedException {

		Vector<String> names = new Vector<String>();

		Thread t1 = new Thread(() -> {
			String[] data = { "Vinod", "Shyam", "Harish", "Ramesh", "John" };
			for (var name : data) {
				names.add(name);
				sleepFor(200);
			}
		});
		t1.start();

		Thread t2 = new Thread(() -> {
			String[] data = { "KIRAN", "KISHORE", "UMESH", "RAJESH", "NAGESH" };
			for (var name : data) {
				names.add(name);
				sleepFor(200);
			}
		});
		t2.start();

		t1.join();
		t2.join();

		System.out.println("List of names: ");
		for (var name : names) {
			System.out.println(name);
		}

	}

	private static void sleepFor(long ms) {
		try {
			Thread.sleep(ms);
		} catch (Exception e) {
		}
	}
}

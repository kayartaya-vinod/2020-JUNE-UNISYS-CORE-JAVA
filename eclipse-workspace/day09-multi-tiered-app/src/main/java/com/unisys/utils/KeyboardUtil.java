package com.unisys.utils;

import java.util.Scanner;

@SuppressWarnings("resource")
public final class KeyboardUtil {
	private KeyboardUtil() {
	}

	public static String getString(String msg) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static int getInt(String msg) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}

package com.unisys.programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateCollection {
	
	static void print(List<?> list) {
		System.out.println("List contains..: ");
		for (Object n : list) {
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10); list1.add(20); list1.add(50);
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(11);list2.add(12); list2.add(41);
		
		Vector<String> list3 = new Vector<String>();
		list3.add("Vinod"); list3.add("Kumar");
		
		print(list1);
		print(list2);
		print(list3);
	}

}


/*
interface X {
	void fx();
	default void fn() {
		System.out.println("X.fn() is called");
	}
}

interface Y {
	void fy();
	int fn(int a);
	default void fn() {
		System.out.println("Y.fn() is called.");
	}
}

interface Z extends X, Y {}

class Test implements Z {

	@Override
	public void fx() {
	}

	@Override
	public void fy() {
	}

	@Override
	public int fn(int a) {
		return 0;
	}
	
}
*/

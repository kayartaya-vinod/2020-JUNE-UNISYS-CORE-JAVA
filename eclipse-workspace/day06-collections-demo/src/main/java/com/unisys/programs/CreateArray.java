package com.unisys.programs;

import java.util.Arrays;

import com.unisys.entity.Person;

public class CreateArray {

	public static void main(String[] args) {
		System.out.println("Start of main.");
		Person[] people = new Person[3];
		
		System.out.println("initializing people[0]..");
		people[0] = new Person("John", "1987-02-04");
		people[2] = new Person("Jane", "1977-12-10");
		
		System.out.println(Arrays.toString(people));
		
		
		System.out.println("End of main.");
	}
	
	public static void main_old(String[] args) {

		int[] nums = { 12, 34 };
		// nums = new int[3];
		// nums = new int[] {12, 34, 56, 78};

		System.out.println("nums currently is " + Arrays.toString(nums));
		System.out.println("There are " + nums.length + " ints in nums.");

		for (int i = 0; i < nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
		System.out.println();
		// enhanced for loop (a.k.a. for-each)
		for(int num: nums) {
			System.out.println("num = " + num);
		}
	}

}

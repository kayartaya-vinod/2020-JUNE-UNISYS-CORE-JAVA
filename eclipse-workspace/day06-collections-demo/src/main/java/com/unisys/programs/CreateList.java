package com.unisys.programs;

import java.util.ArrayList;
import java.util.List;

public class CreateList {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(100);
		nums.add(200);
		nums.add(1);
		
		System.out.println(nums);
		
		nums.add(0, 50);
		System.out.println(nums);
		
		nums.add(3, 55);
		System.out.println(nums);
		
		System.out.println("num at index 2 is " + nums.get(2));
		
		int deleted = nums.remove(1);
		System.out.println("after deleting " + deleted + ", nums is " + nums);
		
		Integer x = 1;
		nums.remove(x);
		System.out.println("After deleting 1, nums is " + nums);
		
	}
	
	

}

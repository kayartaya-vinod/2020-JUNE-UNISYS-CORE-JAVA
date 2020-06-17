package com.unisys.programs;

public class CreateThreadsUsingRunnable {

	public static void main(String[] args) {
		

		new Thread(() -> {
			for(var i=1; i<20; i++) {
				System.out.println( Thread.currentThread().getName() + ": Value of i is " + i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "Server Process 1").start();
		

		new Thread(() -> {
			for(var j=1; j<20; j++) {
				System.out.println(Thread.currentThread().getName() + ": Value of j is " + j);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "Server Process 2").start();
	

		for(var i=1; i<20; i++) {
			System.out.println( Thread.currentThread().getName() + ": Value of i is " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

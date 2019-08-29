package com.zy.day6.thread01;

/*
 * thread礼让
 * 
 */
public class ThreadYield {

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("领导");
				}
			};
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					if (i % 2==0) {
						Thread.yield();
					}
					System.out.println("员工");
				}
			};
		};
		t2.start();
		t1.start();
	}

}

package com.zy.day6.thread01;

/*
 * 线程的加入
 */
public class ThreadJoin {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println("hello");
				}
			};
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i <50; i++) {
					if (i ==10) {
						//t1线程加入
						try {
							t1.join();
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}
					System.out.println("java");
				}
			};
		};
		
		t2.start();
		t1.start();
	}

}

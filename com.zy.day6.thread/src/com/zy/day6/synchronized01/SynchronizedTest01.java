package com.zy.day6.synchronized01;

/**
 * 使用多线程运行Task类中的方法
 *
 */
public class SynchronizedTest01 {

	public static void main(String[] args) {
		Task task = new Task();
		
		Task task1 = new Task();
		
		Thread t1 = new Thread(){
			
			public void run(){
				task.changeNum(true);
			}
		};
		
		Thread t2 = new Thread(){
			
			public void run(){
				task1.changeNum(false);
			}
		};
		
		t1.start();
		t2.start();
	}

}

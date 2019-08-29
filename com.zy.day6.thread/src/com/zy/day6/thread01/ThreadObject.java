package com.zy.day6.thread01;

/*
 * 获取Thread对象
 */
public class ThreadObject {

	public static void main(String[] args) {

		new Thread(new Runnable() {
			//获取当前进程对象
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		}).start();
		
		//主线程的名字
		System.out.println(Thread.currentThread().getName());
	}

}

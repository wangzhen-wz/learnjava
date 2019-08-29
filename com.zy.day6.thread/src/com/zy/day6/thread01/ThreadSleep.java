package com.zy.day6.thread01;

/*
 * Thread类中的sleep方法，让当前进程睡眠
 */
public class ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println("java");
				}
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println("hello");
				}
			}
		}.start();

		for (int i = 10; i > 0; i--) {
			//当前线程睡眠1000毫秒=1秒
			Thread.sleep(1000);
			System.out.println("倒计时" + i);
		}
	}

}

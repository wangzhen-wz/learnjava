package com.zy.day6.thread01;

/*
 * 中断或者唤醒正在睡眠的进程
 */
public class ThreadInterrupt {

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				try {
					Thread.sleep(1000000000L);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				for (int i = 0; i < 10; i++) {
					System.out.println("sleep");
				}
			};
		};
		t1.start();
		t1.interrupt();//唤醒线程或者中断睡眠
	}

}

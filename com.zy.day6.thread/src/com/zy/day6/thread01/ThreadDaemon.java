package com.zy.day6.thread01;

/**
 * 守护线程
 *
 */
public class ThreadDaemon {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0; i<100; i++){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("守护线程");
				}
				
			}
		};
		
		
		Thread t2 = new Thread(){
			public void run(){
				for(int i=0; i<10; i++){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("非守护线程");
				}
				
			}
		};
		
		//将t1设置为守护线程
		t1.setDaemon(true);
		t1.start();
		t2.start();
	}

}

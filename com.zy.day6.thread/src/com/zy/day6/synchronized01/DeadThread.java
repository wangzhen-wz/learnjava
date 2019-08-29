package com.zy.day6.synchronized01;

/**
 * ����
 *
 */
public class DeadThread {

	private static Object obj1 = new Object();
	private static Object obj2 = new Object();
	
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run(){
				synchronized(obj1){
					System.out.println(this.getName() + "=====obj1");
					
					synchronized(obj2){
						System.out.println(this.getName() + "=====obj2");
					}
				}
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				synchronized(obj2){
					System.out.println(this.getName() + "=====obj2");
					
					synchronized(obj1){
						System.out.println(this.getName() + "=====obj1");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}

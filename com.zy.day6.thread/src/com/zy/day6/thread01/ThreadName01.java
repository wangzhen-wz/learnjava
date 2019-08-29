package com.zy.day6.thread01;

/*
 * 设置和获取线程名字
 */
public class ThreadName01 {

	public static void main(String[] args) {

		method01();
		method02();
		method03();
	}

	public static void method03() {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("I am " + this.getName());
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println("I am " + this.getName());
			}
		};
		t1.setName("马化腾");
		t2.setName("马云");
		t1.start();
		t2.start();
	}

	public static void method02() {
		new Thread() {
			@Override
			public void run() {
				this.setName("马化腾");
				System.out.println("I am " + this.getName());
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				this.setName("马云");
				System.out.println("I am " + this.getName());
			}
		}.start();
	}

	private static void method01() {
		new Thread("马化腾") {
			@Override
			public void run() {
				System.out.println("I am " + this.getName());
			}
		}.start();	
		
		new Thread("马云") {
			@Override
			public void run() {
				System.out.println("I am " + this.getName());
			}
		}.start();
	}

}

package com.zy.day6.thread01;

/*
 * ���úͻ�ȡ�߳�����
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
		t1.setName("����");
		t2.setName("����");
		t1.start();
		t2.start();
	}

	public static void method02() {
		new Thread() {
			@Override
			public void run() {
				this.setName("����");
				System.out.println("I am " + this.getName());
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				this.setName("����");
				System.out.println("I am " + this.getName());
			}
		}.start();
	}

	private static void method01() {
		new Thread("����") {
			@Override
			public void run() {
				System.out.println("I am " + this.getName());
			}
		}.start();	
		
		new Thread("����") {
			@Override
			public void run() {
				System.out.println("I am " + this.getName());
			}
		}.start();
	}

}

package com.zy.day6.thread01;

/*
 * �̵߳ļ���
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
						//t1�̼߳���
						try {
							t1.join();
						} catch (InterruptedException e) {
							// TODO �Զ����ɵ� catch ��
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

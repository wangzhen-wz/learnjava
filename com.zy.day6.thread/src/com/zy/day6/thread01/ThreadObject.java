package com.zy.day6.thread01;

/*
 * ��ȡThread����
 */
public class ThreadObject {

	public static void main(String[] args) {

		new Thread(new Runnable() {
			//��ȡ��ǰ���̶���
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		}).start();
		
		//���̵߳�����
		System.out.println(Thread.currentThread().getName());
	}

}

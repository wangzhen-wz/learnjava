package com.zy.day6.thread01;

/*
 * Thread���е�sleep�������õ�ǰ����˯��
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
						// TODO �Զ����ɵ� catch ��
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
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
					System.out.println("hello");
				}
			}
		}.start();

		for (int i = 10; i > 0; i--) {
			//��ǰ�߳�˯��1000����=1��
			Thread.sleep(1000);
			System.out.println("����ʱ" + i);
		}
	}

}

package com.zy.day6.thread01;

/*
 * �жϻ��߻�������˯�ߵĽ���
 */
public class ThreadInterrupt {

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				try {
					Thread.sleep(1000000000L);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				for (int i = 0; i < 10; i++) {
					System.out.println("sleep");
				}
			};
		};
		t1.start();
		t1.interrupt();//�����̻߳����ж�˯��
	}

}

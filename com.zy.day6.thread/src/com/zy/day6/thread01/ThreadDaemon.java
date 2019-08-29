package com.zy.day6.thread01;

/**
 * �ػ��߳�
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
					System.out.println("�ػ��߳�");
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
					System.out.println("���ػ��߳�");
				}
				
			}
		};
		
		//��t1����Ϊ�ػ��߳�
		t1.setDaemon(true);
		t1.start();
		t2.start();
	}

}

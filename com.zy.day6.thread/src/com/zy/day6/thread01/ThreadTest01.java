package com.zy.day6.thread01;

//ʹ��run���������߳�


//�Զ���һ���࣬����java��lang���µ�Thread��
class MyThread extends Thread {

	//��д�󷽷�
	@Override
	public void run() {
		//��Ҫ���߳���ִ�еĴ���д��run������
		for (int i = 0; i < 1000; i++) {
			System.out.println("java!hello");
		}
	}
}

public class ThreadTest01{
	public static void main(String[] args) {
		//�����Զ������
		MyThread mt = new MyThread();
		//����start���������߳�
		mt.start();
		
		//�����Զ������
		MyThread mt1 = new MyThread();
		//����start���������߳�
		mt1.start();
				
		for (int i = 0; i < 1000; i++) {
			System.out.println("1024");
		}
	}
}

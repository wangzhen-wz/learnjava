package com.zy.day6.thread01;

import java.io.IOException;
import java.nio.CharBuffer;

//�Զ���һ���࣬����java��lang���µ�runnable��
class MyRunnable implements Runnable{

	//��дrun����
	@Override
	public void run() {
		//��Ҫ���߳���ִ�еĴ���д��run������
		for (int i = 0; i < 1000; i++) {
			System.out.println("java!hello");
		}
	}
	
}

public class ThreadTest02 {
	
	public static void main(String[] args) {

		//�����Զ������
		MyRunnable mr1 = new MyRunnable();
		//����һ��Thread���󲢽����涨����Ķ������������ݸ�Thread�Ĺ��췽��
		Thread t1 =new Thread(mr1);
		//����start���������߳�
		t1.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("1024");
		}
	}

}

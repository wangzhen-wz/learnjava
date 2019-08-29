package com.zy.day6.thread01;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * ʹ�������ڲ��ഴ���߳�
 */
public class ThreadTest04 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//Thread
		new Thread() {							//����һ��Thread�����
			@Override							//��дrun����
			public void run() {
				for (int i = 0; i < 100; i++) {	//��Ҫ���߳���ִ�еĴ���д��run������
					System.out.println("java");
				}
			}
		}.start();								//�����߳�
		
		//Runnable
		new Thread(new Runnable() {				//����һ��runnable�����
			
			@Override
			public void run() {					//��дrun����
				for (int i = 0; i < 100; i++) {	//��Ҫ���߳���ִ�еĴ���д��run������
					System.out.println("hello");
				}
			}
		}).start();								//�����߳�
		
		//Callable
		ExecutorService es = Executors.newCachedThreadPool();//�����̳߳�	
		Future<Integer> result = es.submit(new Callable<Integer>() {//����callable����
																//��callable��������߳���
			@Override											//��ȡ�̷߳��ص�future����
			public Integer call() throws Exception {
				return 88;
			}
		});
		System.out.println(result.get());						//��ȡ�̼߳���ķ��ؽ��
		es.shutdown();											//�ر��̳߳�
	}	
}

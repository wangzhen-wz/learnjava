package com.zy.day6.thread01;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

////�Զ���һ���࣬����java��util.concurrent���µ�Callable�ӿ�
class MyCallable implements Callable<Integer>{

	//�׳�
	private int count;
	
	public MyCallable(int i) {
		// TODO �Զ����ɵĹ��캯�����
	}
	//��дcall��������
	@Override
	public Integer call() throws Exception {
		//��Ҫ���߳���ִ�еĴ����д��call����������
		int sum = 1;
		if (count != 0) {
			for (int i = 0; i <= count; i++) {
				sum *= i;
			}
		} else {
			sum = 0;
		}
		return sum;
	}
}


public class ThreadTest03 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		//����һ��ExecutorService�̳߳�
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		//����һ��ExecutorService�̳߳�,������̻߳��������������������
		ExecutorService es1 = Executors.newCachedThreadPool();
		
		//���Զ���Ķ�������̳߳�����
		Future<Integer> f1 = es.submit(new MyCallable(5));
		Future<Integer> f2 = es.submit(new MyCallable(3));
		
		//��ȡ�̵߳ķ��ؽ��
//		if (f1.isDone()) {
//			System.out.println(f1.get());
//		} else {
//			System.out.println("f1�߳��е�����δִ�����");
//		}if (f1.isDone()) {
//			System.out.println(f1.get());
//		} else {
//			System.out.println("f2�߳��е�����δִ�����");
//		}
		System.out.println(f1.get());
		System.out.println(f1.get());
		
		//�ر��̳߳�
		es.shutdown();
	}

}

package com.zy.day6.synchronized01;

/**
 * ����
 *
 */
public class Task {
	
	//����̹߳�����ڴ棬��ĳ��ʱ����ڣ�����߳̿���ͬʱ����changeNum�����޸�num��ֵ�������ᵼ���̰߳�ȫ����
	private int num = 0;
	
	//ͬ�����첽
	public synchronized void changeNum(boolean flag){
		if(flag){
			num = 88;
			
			System.out.println(Thread.currentThread().getName() + "========== begin");
			System.out.println(Thread.currentThread().getName() + "==========" + num);
			System.out.println(Thread.currentThread().getName() + "========== end");
		}else{
			num = 66;
			
			System.out.println(Thread.currentThread().getName() + "========== begin");
			System.out.println(Thread.currentThread().getName() + "==========" + num);
			System.out.println(Thread.currentThread().getName() + "========== end");
		}
	}
	
	
}
